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

	public static void main(String xyz[]) {
		BankingApp bankingappvariable = new BankingApp();
	}

	BankingApp() {

		openaccountvariable = new OpenAccountWindow();

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
	ResultSet QABank;
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

	public OpenAccountWindow() {

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
							"jdbc:mysql://localhost/qabank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT",
							"root", "");
					Statement strefvar1 = con.createStatement(); //max(substring(Accno,3,5))
					Statement strefvar2 = con.createStatement();
					ResultSet resultsfromtablebank = strefvar1.executeQuery("select * from (select * from bank where Accno like '"+ accounttypecheck+"%' as T1) as T2" );
					// SQLinsert ="INSERT INTO bank (Accno,Name,Address) VALUES ('"+accounttypecheck+gendercheck+"' , '"+name+"' , '"+addressstring+"' )";
				//	 strefvar2.executeUpdate(SQLinsert);
					while (resultsfromtablebank.next()) {
						System.out.println(resultsfromtablebank.getString(1));
					}
				} catch (Exception gener1) {
					System.out.println("general error 1 ->" + gener1.toString());
				}

			}
		}

		);
	}

	public void actionPerformed(ActionEvent hi) {

	}

}
