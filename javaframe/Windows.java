import java.awt.*;
import java.awt.event.*;

class Windows{
	public static void main(String xyz[]){
		Frame F= new Frame("QA Consulting");
		TextField T = new TextField();
		Button B1 = new Button("click 1");
		Button B2 = new Button("click 2");
		Button B3 = new Button("click 3");
		Button B4 = new Button("click 4");
		Button B5 = new Button("click 5");
		MyEvent1 E1= new MyEvent1(T);
		MyEvent2 E2= new MyEvent2();
		MyEvent3 E3= new MyEvent3();
		MyEvent4 E4= new MyEvent4();
		MyEvent5 E5= new MyEvent5();

		
		B1.addActionListener(E1);
		B2.addActionListener(E2);
		B3.addActionListener(E3);
		B4.addActionListener(E4);
		B5.addActionListener(E5);
		F.add(B1,BorderLayout.CENTER);
		F.add(T,BorderLayout.NORTH);
		F.add(B2,BorderLayout.EAST);
		F.add(B3,BorderLayout.WEST);
		F.add(B4,BorderLayout.SOUTH);
		// F.add(B5,BorderLayout.NORTH);
		F.setVisible(true);
		F.setSize(800,800);
	}

}

class MyEvent1 implements ActionListener
{
	public MyEvent1(){
		
	}
	TextField TXT;
	public MyEvent1(TextField J){
		TXT=J;
	}
	public void actionPerformed(ActionEvent X){
			System.out.println(TXT.getText());
			// TXT.setText("Hello My Friend!");
	}
}
class MyEvent2 implements ActionListener
{
	public void actionPerformed(ActionEvent X){
			System.out.println("My");
	}
}
class MyEvent3 implements ActionListener
{
	public void actionPerformed(ActionEvent X){
			System.out.println("Friend");
	}
}
class MyEvent4 implements ActionListener
{
	public void actionPerformed(ActionEvent X){
			System.out.println("Farhan!");
	}
}
class MyEvent5 implements ActionListener
{
	public void actionPerformed(ActionEvent X){
		MyEvent1 E1= new MyEvent1();
		MyEvent2 E2= new MyEvent2();
		MyEvent3 E3= new MyEvent3();
		MyEvent4 E4= new MyEvent4();
		E1.actionPerformed(X);
		E2.actionPerformed(X);
		E3.actionPerformed(X);
		E4.actionPerformed(X);
	}
}