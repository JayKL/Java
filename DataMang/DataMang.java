import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DataMang implements ActionListener{
		
	
	Frame datamangframe;
	Button dataentrybtn = new Button("Data Entry");		
	Button viewrecordsbtn = new Button("View Records Button");
	JavaSQLcon javasqlconrefvar;
	NextRecord nextrecordrefvar;
	
	
	
	
	public static void main(String xyz[]){
	 DataMang refvarmainit=new DataMang();	
	}

	
	public DataMang(){
		
		
		

		javasqlconrefvar=new JavaSQLcon();
		nextrecordrefvar=new NextRecord();
		datamangframe=new Frame();
		datamangframe.setLayout(new GridLayout(2,1));
		datamangframe.add(dataentrybtn);
		datamangframe.add(viewrecordsbtn);
		datamangframe.setVisible(true);
		datamangframe.setSize(250,250);
		datamangframe.addWindowListener(new WindowsEvents());
		
		// javasqlconrefvar.appframe.setVisible(true);
		dataentrybtn.addActionListener(this);
		viewrecordsbtn.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent buttonclciked){
		
		Button btn=(Button)	buttonclciked.getSource();
		try{
		if (btn==dataentrybtn){
					javasqlconrefvar.appframe.setVisible(true);

		}
		if (btn==viewrecordsbtn){
					nextrecordrefvar.recordframe.setVisible(true);

		}}catch (Exception gener){
			System.out.println(gener);
		}
	}

}








class NextRecord{
	public static void main(String xyz[]){
		try{
		NextRecord refvarmain= new NextRecord();
		}catch(Exception aahh){
			System.out.println(aahh.toString());
		}

	}
	
	public Frame recordframe;
	ResultSet QAstudentstable;
	Button nextbutton,changeframebutton;
	TextField regnotf,nametf,marktf,pertf,resulttf;
	Label regnol,namel,markl,perl,resultl;
	
	
	
	public NextRecord(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/QA","root","");
			Statement strefvar=con.createStatement();
			QAstudentstable=strefvar.executeQuery("select * from Students");
		}catch(Exception gener1){
			System.out.println("general error 1 ->"+gener1.toString());
		}

		regnotf=new TextField(10);
		nametf=new TextField(10);
		marktf=new TextField(10);
		pertf=new TextField(10);
		resulttf=new TextField(10);
		regnol=new Label("Regno");
		namel=new Label("Name");
		markl=new Label("Mark");
		perl=new Label("Per");
		resultl=new Label("Result");

		nextbutton= new Button("Next");
		changeframebutton= new Button("Change");
		
		recordframe=new Frame();
		recordframe.setLayout(new GridLayout(6,2));


		recordframe.add(regnol);recordframe.add(regnotf);
		recordframe.add(namel);recordframe.add(nametf);
		recordframe.add(markl);recordframe.add(marktf);
		recordframe.add(perl);recordframe.add(pertf);
		recordframe.add(resultl);recordframe.add(resulttf);
		recordframe.add(new Label());recordframe.add(nextbutton);
		recordframe.addWindowListener(new WindowsEvents());

		
		
		try{
		QAstudentstable.next();
		ShowRecord();
		}catch(Exception gener2){
			System.out.println("general error 2 ->"+gener2.toString());
		}
				
		// recordframe.setVisible(true);
		recordframe.setSize(300,300);

		
		
		
		
		nextbutton.addActionListener(
			new ActionListener(){
					public void actionPerformed(ActionEvent nextbuttonhit)
					{
						try{
							if (QAstudentstable.next()){
								ShowRecord();
							}
						}catch(Exception gener3){
							System.out.print("general error 3 ->" + gener3);
						}
					}
			}		
		);
		
		// changeframebutton.addActionListener(
			// new ActionListener(){
					// public void actionPerformed(ActionEvent nextbuttonhit)
					// {
						// if (recordframe.isVisible()){
							// recordframe.setVisible(false);
							// insertframe.setVisible(true);
						// } else{
							// recordframe.setVisible(true);
							// insertframe.setVisible(false);
						// }
					// }
			// }
		// );
		

			
	}
	
	
	public void ShowRecord(){
		try{
			regnotf.setText(Integer.toString(QAstudentstable.getInt(1)));
			nametf.setText(QAstudentstable.getString(2));
			marktf.setText(Integer.toString(QAstudentstable.getInt(3)));
			pertf.setText(Float.toString((float)QAstudentstable.getInt(3)*100/150));
			if (((float)QAstudentstable.getInt(3)*100/150)>50){
				resulttf.setText("passed");
			} else {
				resulttf.setText("failed");
			}
		}catch(Exception gener4){
			System.out.println("general error 4 ->"+gener4.toString());
		}
		
		
	}
	

}






class JavaSQLcon implements ActionListener{
	public Frame appframe;
	public static void main(String xyz[]){
		JavaSQLcon variableforapp= new JavaSQLcon();		
	}
		TextField regnoinput= new TextField(5);
		TextField nameinput= new TextField(5);
		TextField marksinput= new TextField(5);
		Label regnolabel = new Label("Regno");
		Label namelabel = new Label("Name");
		Label markslabel = new Label("Marks");
		Button savebutton = new Button("Save");

	public JavaSQLcon(){
		appframe=new Frame("SQL Entry");
		Panel apppanel=new Panel();
		Panel subpanel1=new Panel();
		Panel subpanel2=new Panel();
		Panel subpanel3=new Panel();
		apppanel.setLayout(new GridLayout(4,2));
		apppanel.add(subpanel1);
		apppanel.add(regnoinput);
		apppanel.add(subpanel2);
		apppanel.add(nameinput);
		apppanel.add(subpanel3);
		apppanel.add(marksinput);
		apppanel.add(savebutton);
		subpanel1.add(regnolabel);
		subpanel2.add(namelabel);
		subpanel3.add(markslabel);
		appframe.add(apppanel,BorderLayout.CENTER);
		appframe.addWindowListener(new WindowsEvents());
		// appframe.setVisible(true);
		appframe.setSize(300,200);
		
		savebutton.addActionListener(this);

		

	}
	String regnostring;
	String namestring;
	String marks;
	public void actionPerformed(ActionEvent referencevariable){
		Button btn=(Button) referencevariable.getSource();
		if (btn==savebutton){
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/QA","root","");
			Statement strefvar=con.createStatement();
			strefvar.executeUpdate("insert into Students values("+regnoinput.getText()+",'"+nameinput.getText()+"',"+marksinput.getText()+")");
			}catch(Exception E){
			System.out.println("->"+E.toString());
		}
		}
		ShowTable();
	}
	
	public void ShowTable(){
			try{
	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/QA","root","");
			Statement strefvar=con.createStatement();
			ResultSet resultfromquery=strefvar.executeQuery("select * from Students");
			while (resultfromquery.next()){
				System.out.println("| Regno: " + resultfromquery.getInt(1) + "|			Name: " + resultfromquery.getString(2) + "|			Marks: " +resultfromquery.getInt(3) + "|" );
			}
			// strefvar.executeUpdate("insert into Students values(6,'Dan',149)");
		}
		catch(Exception E){
			System.out.println("->"+E.toString());
		}
	}
}