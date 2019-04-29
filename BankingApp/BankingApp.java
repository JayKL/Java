import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BankingApp implements WindowListener {

	JFrame mainwindow = new JFrame("BANK NAME");
	JMenuBar mainmenu = new JMenuBar();
	JMenu bankingmenu = new JMenu("Services");
	JMenuItem openaccountmenuitem = new JMenuItem("Open Account");
	JMenuItem depositmenuitem = new JMenuItem("Deposit Amount");
	JMenuItem withdrawmenuitem = new JMenuItem("Withdraw Money");
	JMenuItem checkbalancemenuitem = new JMenuItem("Check Balance");
	OpenAccountWindow openaccountvariable;
	WithDrawCheck withdrawcheckrefvar;
	public int CheckValue=0;

	public static void main(String xyz[]) {
		BankingApp bankingappvariable = new BankingApp();
	}

	BankingApp() {

		openaccountvariable = new OpenAccountWindow();
		withdrawcheckrefvar = new WithDrawCheck();

		bankingmenu.add(openaccountmenuitem);
		bankingmenu.add(depositmenuitem);
		bankingmenu.add(withdrawmenuitem);
		bankingmenu.add(checkbalancemenuitem);
		mainmenu.add(bankingmenu);
		mainwindow.setJMenuBar(mainmenu);
		mainwindow.setVisible(true);
		mainwindow.setSize(400, 400);

		openaccountmenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent openaccounthit) {
				try {
					openaccountvariable.openaccwin.setVisible(true);
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});


		depositmenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent deposithit) {
				try {
					withdrawcheckrefvar.withdrawcheckwin.setVisible(false);
					withdrawcheckrefvar.currentbalanceinfo.setVisible(false);
					withdrawcheckrefvar.currentbalanceinfo.setText("");
					withdrawcheckrefvar.amounttf.setText("");
					withdrawcheckrefvar.amountlabel.setText("Deposit Amount: ");
					withdrawcheckrefvar.amounttf.setVisible(true);
					withdrawcheckrefvar.savebutton.setText("Deposit");
					withdrawcheckrefvar.withdrawordep=true;
					withdrawcheckrefvar.areyouwith=false;
					withdrawcheckrefvar.tablenamewithordep="deposit";
					withdrawcheckrefvar.withdrawcheckwin.setVisible(true);
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});
		
		
		withdrawmenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent withdrawhit) {
				try {
					withdrawcheckrefvar.withdrawcheckwin.setVisible(false);
					withdrawcheckrefvar.currentbalanceinfo.setVisible(false);
					withdrawcheckrefvar.currentbalanceinfo.setText("");
					withdrawcheckrefvar.amounttf.setText("");
					withdrawcheckrefvar.amountlabel.setText("Withdraw Amount: ");
					withdrawcheckrefvar.amounttf.setVisible(true);
					withdrawcheckrefvar.savebutton.setText("Withdraw");
					withdrawcheckrefvar.withdrawordep=true;
					withdrawcheckrefvar.areyouwith=true;
					withdrawcheckrefvar.tablenamewithordep="withdraw";
					withdrawcheckrefvar.withdrawcheckwin.setVisible(true);
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});
				
		checkbalancemenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent checkbalancehit) {
				try {
					withdrawcheckrefvar.withdrawordep=false;
					withdrawcheckrefvar.areyouwith=false;
					withdrawcheckrefvar.currentbalanceinfo.setVisible(true);
					withdrawcheckrefvar.withdrawcheckwin.setVisible(false);
					withdrawcheckrefvar.amountlabel.setText("Current Amount:  ");
					withdrawcheckrefvar.amounttf.setVisible(false);
					withdrawcheckrefvar.savebutton.setText("Check Balance");
					withdrawcheckrefvar.withdrawcheckwin.setVisible(true);
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});
		

	}

	public void windowOpened(WindowEvent X) {
	};

	public void windowClosing(WindowEvent X) {
		System.exit(0);
	};

	public void windowClosed(WindowEvent X) {
	};

	public void windowIconified(WindowEvent X) {
	};

	public void windowDeiconified(WindowEvent X) {
	};

	public void windowActivated(WindowEvent X) {
	};

	public void windowDeactivated(WindowEvent X) {
	};

}

class OpenAccountWindow implements ActionListener {
	public JTextField openacccnametb = new JTextField(20);
	public JTextField openaddresstb = new JTextField(20);
	JPanel oppenaccountnamenaddress = new JPanel();
	JPanel openaccountmiddlepanel = new JPanel();
	JPanel openaccountsavcur = new JPanel();
	JPanel openaccountgender = new JPanel();
	JPanel openaccountsave = new JPanel();
	JButton openaccountsavebtn = new JButton("Create");

	JLabel oname = new JLabel("Name");
	JLabel oaddress = new JLabel("Address");
	JLabel emptylabel = new JLabel();
	JRadioButton savingscb = new JRadioButton("Savings");
	JRadioButton currentcb = new JRadioButton("Current");
	JRadioButton malerb = new JRadioButton("Male");
	JRadioButton femalerb = new JRadioButton("Female");
	JRadioButton nonbinrb = new JRadioButton("Non-Binary");
	public JFrame openaccwin = new JFrame("Open Account");
	ButtonGroup savcurgroup = new ButtonGroup();
	ButtonGroup gendergroup = new ButtonGroup();

	public OpenAccountWindow(){

		savcurgroup.add(savingscb);
		savcurgroup.add(currentcb);

		gendergroup.add(malerb);
		gendergroup.add(femalerb);
		gendergroup.add(nonbinrb);

		openaccountsavcur.setBorder(BorderFactory.createTitledBorder("Account Type"));
		openaccountgender.setBorder(BorderFactory.createTitledBorder("Account Owner Gender"));

		oppenaccountnamenaddress.setLayout(new GridLayout(2, 2));
		openaccountmiddlepanel.setLayout(new GridLayout(1, 2));
		openaccountsavcur.setLayout(new GridLayout(2, 1));
		openaccountgender.setLayout(new GridLayout(3, 1));
		openaccountsave.setLayout(new GridLayout(1, 2));

		openaccwin.setLayout(new GridLayout(3, 1));
		openaccwin.setSize(400, 400);
		openaccwin.setLocation(500, 0);
		openaccwin.add(oppenaccountnamenaddress);
		openaccwin.add(openaccountmiddlepanel);
		openaccwin.add(openaccountsave);

		oppenaccountnamenaddress.add(oname);
		oppenaccountnamenaddress.add(openacccnametb);
		oppenaccountnamenaddress.add(oaddress);
		oppenaccountnamenaddress.add(openaddresstb);
		openaccountmiddlepanel.add(openaccountsavcur);
		openaccountmiddlepanel.add(openaccountgender);

		openaccountsavcur.add(savingscb);
		openaccountsavcur.add(currentcb);
		openaccountgender.add(malerb);
		openaccountgender.add(femalerb);
		openaccountgender.add(nonbinrb);

		openaccountsave.add(emptylabel);
		openaccountsave.add(openaccountsavebtn);

		savingscb.setSelected(true);
		nonbinrb.setSelected(true);
		savingscb.setMnemonic(KeyEvent.VK_B);
		savingscb.setActionCommand("hi");

		openaccountsavebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent savebutton) {

				String accounttypecheck = "";
				String gendercheck = "";
				String name = "";
				String addressstring = "";
				String SQLinsert = "";
				String accountnumber="";

				if (savingscb.isSelected()) {
					accounttypecheck = "S";
				}
				if (currentcb.isSelected()) {
					accounttypecheck = "C";
				}
				if (malerb.isSelected()) {
					gendercheck = "M";
				}
				if (femalerb.isSelected()) {
					gendercheck = "F";
				}
				if (nonbinrb.isSelected()) {
					gendercheck = "X";
				}

				name = openacccnametb.getText();
				addressstring = openaddresstb.getText();

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/qabank",
							"root", "");
					Statement strefvar1 = con.createStatement(); //max(substring(Accno,3,5))
					Statement strefvar2 = con.createStatement();
					ResultSet resultsfromtablebank = strefvar1.executeQuery("select IFNULL(LPAD(max(substring(Accno,3,5))+1,3,'0'),'001') from (select * from bank where Accno like '"+ accounttypecheck+"%') as T1" );
					resultsfromtablebank.next();
					accountnumber=resultsfromtablebank.getString(1);
					SQLinsert ="INSERT INTO bank (Accno,Name,Address) VALUES ('"+accounttypecheck+gendercheck+accountnumber+"' , '"+name+"' , '"+addressstring+"' )";
					strefvar2.executeUpdate(SQLinsert);

				} catch (Exception gener1) {
					System.out.println("general error 1 ->" + gener1.toString());
				}

			}
		}

		);
	}

	public void actionPerformed(ActionEvent nonneededvariable) {

	}
}




class WithDrawCheck{
	boolean areyouwith;
	boolean withdrawordep;
	String tablenamewithordep;
	int cont;
	
	public JTextField accountnumbertf = new JTextField(20);
	public JTextField amounttf = new JTextField(20);
	JFrame withdrawcheckwin = new JFrame("Bank App");


	JPanel findaccountnumberpan = new JPanel();
	JPanel nameandaddresspan = new JPanel();
	JPanel insertdepowithpan = new JPanel();
	JButton findaccount = new JButton("Find");
	JButton savebutton = new JButton("");
	
	
	JLabel wdcaccnuml = new JLabel("Account: ");
	JLabel wdcnamel = new JLabel("Name: ");
	JLabel wdcaddressl = new JLabel("Address: ");
	JLabel currentbalanceinfo = new JLabel("");
	JLabel foundnamel = new JLabel("");
	JLabel foundaddressl = new JLabel("");
	JLabel amountlabel = new JLabel("");



	public WithDrawCheck(){
		
		withdrawcheckwin.setLayout(new GridLayout(5, 1));
		findaccountnumberpan.setLayout(new GridLayout(1,3));
		nameandaddresspan.setLayout(new GridLayout(2, 2));
		insertdepowithpan.setLayout(new GridLayout(1,2));
		withdrawcheckwin.setSize(400, 400);
		withdrawcheckwin.setLocation(500, 500);
		
		withdrawcheckwin.add(findaccountnumberpan);
		withdrawcheckwin.add(nameandaddresspan);
		withdrawcheckwin.add(insertdepowithpan);
		withdrawcheckwin.add(amounttf);
		withdrawcheckwin.add(savebutton);
		
		findaccountnumberpan.add(wdcaccnuml);
		findaccountnumberpan.add(accountnumbertf);
		findaccountnumberpan.add(findaccount);
		nameandaddresspan.add(wdcnamel);
		nameandaddresspan.add(foundnamel);
		nameandaddresspan.add(wdcaddressl);
		nameandaddresspan.add(foundaddressl);
		insertdepowithpan.add(amountlabel);
		insertdepowithpan.add(currentbalanceinfo);
		

		
		
		findaccount.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent savebutton) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/qabank",
							"root", "");
					Statement strefvar1 = con.createStatement(); 
					Statement strefvar2 = con.createStatement();
					Statement strefvar3 = con.createStatement();
					ResultSet resultsfromtablebank = strefvar1.executeQuery("select * from bank where Accno='"+accountnumbertf.getText()+"'" );
					resultsfromtablebank.next();
					foundnamel.setText(resultsfromtablebank.getString(2));
					foundaddressl.setText(resultsfromtablebank.getString(3));

				} catch (Exception gener1) {
					System.out.println("Error ->" + gener1.toString());
				}
			}
		}
		);
		
		
		savebutton.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent savebutton) {
										String SQLinsert="";

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/qabank",
							"root", "");
					Statement strefvar1 = con.createStatement(); 
					Statement strefvar2 = con.createStatement();
					Statement strefvar3 = con.createStatement();
					Statement strefvar4 = con.createStatement();
					ResultSet resultsfromtablebank = strefvar1.executeQuery("select * from bank where Accno='"+accountnumbertf.getText()+"'" );
					resultsfromtablebank.next();
					ResultSet resultsfromtablewithdraw = strefvar2.executeQuery("select sum(Amount) from withdraw where Accno='"+accountnumbertf.getText()+"'");
					ResultSet resultsfromtabledeposit = strefvar3.executeQuery("select sum(Amount) from deposit where Accno='"+accountnumbertf.getText()+"'");
					resultsfromtablewithdraw.next();
					resultsfromtabledeposit.next();
					currentbalanceinfo.setText(Float.toString(resultsfromtabledeposit.getFloat(1) - resultsfromtablewithdraw.getFloat(1)));
					if (areyouwith){
						if ((resultsfromtabledeposit.getFloat(1) - resultsfromtablewithdraw.getFloat(1))<=0){
							System.out.println("you do not have enough to withdraw");
							cont=0;
						}
					} else{
						cont=1;
					}
					if (withdrawordep && cont==1){
						SQLinsert ="INSERT INTO "+tablenamewithordep+" (Accno,Amount,Datetime) VALUES ('"+resultsfromtablebank.getString(1)+"',"+amounttf.getText()+",now())";
						strefvar4.executeUpdate(SQLinsert);
						amounttf.setText("");
					}
				} catch (Exception gener1) {
					System.out.println("Error ->" + gener1.toString());
				}
				
			}
		}
		);
		
	}
}
