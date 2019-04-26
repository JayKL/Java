import java.sql.*;
import java.awt.*;
import java.awt.event.*;

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
		appframe.setVisible(true);
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