import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class WindowsEvents implements WindowListener{
		WindowsEvents(){
			      // addWindowListener(this); 
		}
	public void windowOpened(WindowEvent X){System.out.println("Window Open");};
	public void windowClosing(WindowEvent X){
		System.out.println("Window Closing");
		System.exit(0);
	};
	public void windowClosed(WindowEvent X){System.out.println("Window Closed");};
	public void windowIconified(WindowEvent X){System.out.println("window Iconified");};
	public void windowDeiconified(WindowEvent X){System.out.println("Window Deiconified");};
	public void windowActivated(WindowEvent X){System.out.println("Window Activated");};
	public void windowDeactivated(WindowEvent X){System.out.println("Window Deactivated");};

	public static void main(String xyz[]){
	// WindowsEvents x=new WindowsEvent
		JFrame Win=new JFrame();
		JMenuBar Menub= new JMenuBar();
		JMenu Menu1=new JMenu("Farhan");
		JMenu Menu2=new JMenu("Record");
		JMenuItem m1=new JMenuItem("new");
		JMenuItem m2=new JMenuItem("ABC");
		JMenuItem m3=new JMenuItem("X");
		JMenuItem m4=new JMenuItem("Z");
		
		Menu1.add(m1);
		Menu1.add(m2);
		Menu2.add(m3);
		Menu2.add(m4);
		
		Menub.add(Menu1);
		Menub.add(Menu2);

		
		Win.setJMenuBar(Menub);
		
		Win.setVisible(true);}
	
}