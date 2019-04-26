import java.sql.*;
import java.awt.*;
import java.awt.event.*;

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
		
		
		try{
		QAstudentstable.next();
		ShowRecord();
		}catch(Exception gener2){
			System.out.println("general error 2 ->"+gener2.toString());
		}
				
		recordframe.setVisible(true);
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