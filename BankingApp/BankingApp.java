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
	OpenDepositWindow depositaccountvariable;
	OpenWithdrawWindow withdrawacountvariable;
	OpenCheckBalance checkbalancevariable;
	int CheckValue=0;

	public static void main(String xyz[]) {
		BankingApp bankingappvariable = new BankingApp();
	}

	BankingApp() {

		openaccountvariable = new OpenAccountWindow();
		depositaccountvariable = new OpenDepositWindow();
		withdrawacountvariable = new OpenWithdrawWindow();
		checkbalancevariable = new OpenCheckBalance();

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
			public void actionPerformed(ActionEvent openaccounthit) {
				try {
					depositaccountvariable.depositaccwin.setVisible(true);
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});
		
		
		withdrawmenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent openaccounthit) {
				try {
					withdrawacountvariable.withdrawaccwin.setVisible(true);
				} catch (Exception E) {
					System.out.println(E);
				}
			}
		});
				
		checkbalancemenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent openaccounthit) {
				try {
					checkbalancevariable.checkbalancewin.setVisible(true);
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

class OpenDepositWindow{
	public JTextField depositaccnotb = new JTextField(20);
	public JTextField depositnametb = new JTextField(20);
	public JTextField depositaddresstb = new JTextField(20);
	public JTextField depositamounttb = new JTextField(20);
	JFrame depositaccwin = new JFrame("Deposit");


	JPanel depositaccountaccnonamenaddress = new JPanel();
	JPanel depositaccountinsertpanel = new JPanel();
	JButton depositaccountsavebtn = new JButton("Deposit");
	
	
	JLabel depositaccnuml = new JLabel("Accno");
	JLabel depositnamel = new JLabel("Name");
	JLabel depositaddressl = new JLabel("Address");
	JLabel depositl = new JLabel("Deposit Amount");



	public OpenDepositWindow(){
		
		depositaccwin.setLayout(new GridLayout(3, 1));
		depositaccountaccnonamenaddress.setLayout(new GridLayout(3, 3));
		depositaccountinsertpanel.setLayout(new GridLayout(1, 2));
		depositaccwin.setSize(400, 400);
		depositaccwin.setLocation(500, 500);
		
		depositaccwin.add(depositaccountaccnonamenaddress);
		depositaccwin.add(depositaccountinsertpanel);
		depositaccwin.add(depositaccountsavebtn);
		
		depositaccountaccnonamenaddress.add(depositaccnuml);
		depositaccountaccnonamenaddress.add(depositaccnotb);
		depositaccountaccnonamenaddress.add(depositnamel);
		depositaccountaccnonamenaddress.add(depositnametb);
		depositaccountaccnonamenaddress.add(depositaddressl);
		depositaccountaccnonamenaddress.add(depositaddresstb);
		
		depositaccountinsertpanel.add(depositl);
		depositaccountinsertpanel.add(depositamounttb);
		
		depositaccountsavebtn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent savebutton) {
							
			String depositaccounttext="";
			String depositnametext="";
			String depositaddresstext="";
			String depositamounttext="";
			String SQLinsert="";
							
				depositaccounttext=depositaccnotb.getText();
				depositnametext = depositnametb.getText();
				depositaddresstext = depositaddresstb.getText();
				depositamounttext = depositamounttb.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/qabank",
							"root", "");
					Statement strefvar1 = con.createStatement(); //max(substring(Accno,3,5))
					Statement strefvar2 = con.createStatement();
					ResultSet resultsfromtabledeposit = strefvar1.executeQuery("select * from bank where Accno='"+depositaccounttext+"' and Name='"+depositnametext+"' and Address='"+depositaddresstext+"'" );
					resultsfromtabledeposit.next();
					SQLinsert ="INSERT INTO deposit (Accno,Amount,Datetime) VALUES ('"+resultsfromtabledeposit.getString(1)+"',"+depositamounttext+",now())";
					strefvar2.executeUpdate(SQLinsert);
					depositamounttb.setText("");
				} catch (Exception gener1) {
					System.out.println("No Account Found, please check accno, name and address. If forgotten please contact your local branch");
				}
				
			}
		}
		);
		
	}
}



class OpenWithdrawWindow{
	public JTextField withdrawaccnotb = new JTextField(20);
	public JTextField withdrawnametb = new JTextField(20);
	public JTextField withdrawaddresstb = new JTextField(20);
	public JTextField withdrawamounttb = new JTextField(20);
	JFrame withdrawaccwin = new JFrame("Withdraw");


	JPanel withdrawaccountaccnonamenaddress = new JPanel();
	JPanel withdrawaccountinsertpanel = new JPanel();
	JButton withdrawaccountsavebtn = new JButton("Withdraw");
	
	
	JLabel withdrawaccnuml = new JLabel("Accno");
	JLabel withdrawnamel = new JLabel("Name");
	JLabel withdrawaddressl = new JLabel("Address");
	JLabel withdrawl = new JLabel("Withdraw Amount");



	public OpenWithdrawWindow(){
		
		withdrawaccwin.setLayout(new GridLayout(3, 1));
		withdrawaccountaccnonamenaddress.setLayout(new GridLayout(3, 3));
		withdrawaccountinsertpanel.setLayout(new GridLayout(1, 2));
		withdrawaccwin.setSize(400, 400);
		withdrawaccwin.setLocation(500, 500);
		
		withdrawaccwin.add(withdrawaccountaccnonamenaddress);
		withdrawaccwin.add(withdrawaccountinsertpanel);
		withdrawaccwin.add(withdrawaccountsavebtn);
		
		withdrawaccountaccnonamenaddress.add(withdrawaccnuml);
		withdrawaccountaccnonamenaddress.add(withdrawaccnotb);
		withdrawaccountaccnonamenaddress.add(withdrawnamel);
		withdrawaccountaccnonamenaddress.add(withdrawnametb);
		withdrawaccountaccnonamenaddress.add(withdrawaddressl);
		withdrawaccountaccnonamenaddress.add(withdrawaddresstb);
		
		withdrawaccountinsertpanel.add(withdrawl);
		withdrawaccountinsertpanel.add(withdrawamounttb);
		
		withdrawaccountsavebtn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent savebutton) {
							
			String withdrawaccounttext="";
			String withdrawnametext="";
			String withdrawaddresstext="";
			String withdrawamounttext="";
			String SQLinsert="";
							
				withdrawaccounttext=withdrawaccnotb.getText();
				withdrawnametext = withdrawnametb.getText();
				withdrawaddresstext = withdrawaddresstb.getText();
				withdrawamounttext = withdrawamounttb.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/qabank",
							"root", "");
					Statement strefvar1 = con.createStatement(); //max(substring(Accno,3,5))
					Statement strefvar2 = con.createStatement();
					Statement strefvar3 = con.createStatement();
					Statement strefvar4 = con.createStatement();
					ResultSet resultsfromtablebank = strefvar1.executeQuery("select * from bank where Accno='"+withdrawaccounttext+"' and Name='"+withdrawnametext+"' and Address='"+withdrawaddresstext+"'" );
					resultsfromtablebank.next();
					ResultSet resultsfromtablewithdraw = strefvar2.executeQuery("select sum(Amount) from withdraw where Accno='"+withdrawaccounttext+"'");
					ResultSet resultsfromtabledeposit = strefvar3.executeQuery("select sum(Amount) from deposit where Accno='"+withdrawaccounttext+"'");
					resultsfromtablewithdraw.next();
					resultsfromtabledeposit.next();
					if ((resultsfromtabledeposit.getFloat(1) - resultsfromtablewithdraw.getFloat(1))<=0){
						System.out.println("not enough money in accuont to withdraw");
						throw new NotEnoughMoney("not enough money");
					} else{
						SQLinsert ="INSERT INTO withdraw (Accno,Amount,Datetime) VALUES ('"+resultsfromtablebank.getString(1)+"',"+withdrawamounttext+",now())";
						strefvar4.executeUpdate(SQLinsert);
					}
					withdrawamounttb.setText("");
				} catch (Exception gener1) {
					System.out.println("No Account Found, please check accno, name and address. If forgotten please contact your local branch");
				}
				
			}
		}
		);
		
	}
}



class OpenCheckBalance{
	public JTextField checkbalanceaccnotb = new JTextField(20);
	public JTextField checkbalancenametb = new JTextField(20);
	public JTextField checkbalanceaddresstb = new JTextField(20);
	JFrame checkbalancewin = new JFrame("Check Balance");


	JPanel checkbalanceaccountaccnonamenaddress = new JPanel();
	JPanel checkbalancepanel = new JPanel();
	JButton checkbalancesavebtn = new JButton("Check Balance");
	
	
	JLabel checkbalanceaccnuml = new JLabel("Accno");
	JLabel checkbalancenamel = new JLabel("Name");
	JLabel checkbalanceaddressl = new JLabel("Address");
	JLabel currentbalanceinfo = new JLabel("");



	public OpenCheckBalance(){
		
		checkbalancewin.setLayout(new GridLayout(3, 1));
		checkbalanceaccountaccnonamenaddress.setLayout(new GridLayout(3, 3));
		checkbalancepanel.setLayout(new GridLayout(1,2));
		checkbalancewin.setSize(400, 400);
		checkbalancewin.setLocation(500, 500);
		
		checkbalancewin.add(checkbalanceaccountaccnonamenaddress);
		checkbalancewin.add(checkbalancepanel);
		checkbalancewin.add(checkbalancesavebtn);
		
		checkbalanceaccountaccnonamenaddress.add(checkbalanceaccnuml);
		checkbalanceaccountaccnonamenaddress.add(checkbalanceaccnotb);
		checkbalanceaccountaccnonamenaddress.add(checkbalancenamel);
		checkbalanceaccountaccnonamenaddress.add(checkbalancenametb);
		checkbalanceaccountaccnonamenaddress.add(checkbalanceaddressl);
		checkbalanceaccountaccnonamenaddress.add(checkbalanceaddresstb);
		checkbalancepanel.add(new Label("Current Balance: "));
		checkbalancepanel.add(currentbalanceinfo);
		
		
		checkbalancesavebtn.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent savebutton) {
							
			String checkbalanceaccounttext="";
			String checkbalancenametext="";
			String checkbalanceaddresstext="";
			String checkbalanceamounttext="";
			String SQLinsert="";
							
				checkbalanceaccounttext=checkbalanceaccnotb.getText();
				checkbalancenametext = checkbalancenametb.getText();
				checkbalanceaddresstext = checkbalanceaddresstb.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/qabank",
							"root", "");
					Statement strefvar1 = con.createStatement(); 
					Statement strefvar2 = con.createStatement();
					Statement strefvar3 = con.createStatement();
					ResultSet resultsfromtablebankwithdraw = strefvar1.executeQuery("select * from bank where Accno='"+checkbalanceaccounttext+"' and Name='"+checkbalancenametext+"' and Address='"+checkbalanceaddresstext+"'" );
					resultsfromtablebankwithdraw.next();
					ResultSet resultsfromtablewithdraw = strefvar2.executeQuery("select sum(Amount) from withdraw where Accno='"+checkbalanceaccounttext+"'");
					ResultSet resultsfromtabledeposit = strefvar3.executeQuery("select sum(Amount) from deposit where Accno='"+checkbalanceaccounttext+"'");
					resultsfromtablewithdraw.next();
					resultsfromtabledeposit.next();
					currentbalanceinfo.setText(Float.toString(resultsfromtabledeposit.getFloat(1) - resultsfromtablewithdraw.getFloat(1)));
				} catch (Exception gener1) {
					System.out.println("No Account Found, please check accno, name and address. If forgotten please contact your local branch");
				}
				
			}
		}
		);
		
	}
}