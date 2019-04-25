import java.awt.*;
import java.awt.event.*;


class Calculator implements ActionListener{
	public static void main(String xyz[]){
		Calculator variableforcalc = new Calculator();
	}
	TextField n1tbox = new TextField(5);
	TextField n2tbox= new TextField(5);
	TextField answertbox= new TextField(5);
	TextField screen=new TextField(20);
	Button plusbutton = new Button("+");
	Button minusbutton = new Button("-");
	Button dividebutton = new Button("/");
	Button timesbutton = new Button("x");
	Button zerobtn=new Button("0");
	Button onebtn=new Button("1");
	Button twobtn=new Button("2");
	Button threebtn=new Button("3");
	Button fourbtn=new Button("4");
	Button fivebtn=new Button("5");
	Button sixbtn=new Button("6");
	Button sevenbtn=new Button("7");
	Button eightbtn=new Button("8");
	Button ninebtn=new Button("9");
	Button equalsbtn=new Button("=");
	Button clearbtn=new Button("c");
	public Calculator(){
		Frame calframe=new Frame("calculations");
		Panel paneloutput=new Panel();
		Panel panelinput=new Panel();
		panelinput.setLayout(new GridLayout(4,4));
		paneloutput.add(screen);
		panelinput.add(onebtn);
		panelinput.add(twobtn);
		panelinput.add(threebtn);
		panelinput.add(plusbutton);
		panelinput.add(fourbtn);
		panelinput.add(fivebtn);
		panelinput.add(sixbtn);
		panelinput.add(minusbutton);
		panelinput.add(sevenbtn);
		panelinput.add(eightbtn);
		panelinput.add(ninebtn);
		panelinput.add(timesbutton);
		panelinput.add(clearbtn);
		panelinput.add(zerobtn);
		panelinput.add(equalsbtn);
		panelinput.add(dividebutton);
		calframe.add(paneloutput,BorderLayout.NORTH);
		calframe.add(panelinput,BorderLayout.CENTER);

		calframe.setVisible(true);
		calframe.setSize(400,400);

		plusbutton.addActionListener(this);
		minusbutton.addActionListener(this);
		dividebutton.addActionListener(this);
		timesbutton.addActionListener(this);
		zerobtn.addActionListener(this);
		onebtn.addActionListener(this);
		twobtn.addActionListener(this);
		threebtn.addActionListener(this);
		fourbtn.addActionListener(this);
		fivebtn.addActionListener(this);
		sixbtn.addActionListener(this);
		sevenbtn.addActionListener(this);
		eightbtn.addActionListener(this);
		ninebtn.addActionListener(this);
		equalsbtn.addActionListener(this);
		clearbtn.addActionListener(this);
		
	}
	String buttonsave="c";
	double inputnumber1=0;
	double inputnumber2=0;
	double inputsave=0;
	double inputans2=0;
	String finalanswer="";
	double answersave=0;
	String screentextsave;
	boolean hasequalbeenhit=false;
	public void actionPerformed(ActionEvent addref){
		Button btn=(Button) addref.getSource();
		try{
		if (btn==equalsbtn){
			if (!hasequalbeenhit){
				inputnumber2=Double.parseDouble(screen.getText());
			} else
			{			
				inputnumber2=inputnumber2;
				inputnumber1=answersave;
			}

			switch(buttonsave){
				case "+": answersave=inputnumber1+inputnumber2; break;
				case "-": answersave=inputnumber1-inputnumber2; break;
				case "/": answersave=inputnumber1/inputnumber2; break;
				case "*": answersave=inputnumber1*inputnumber2; break;
				case "c": answersave=inputnumber2;
			}
			finalanswer=Double.toString(answersave);
			screen.setText(finalanswer);
			hasequalbeenhit=true;
		}

		if (btn==zerobtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "0");
		}
		if (btn==onebtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "1");
			}
		if (btn==twobtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "2");
			}
		if (btn==threebtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "3");
			}
		if (btn==fourbtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "4");
			}
		if (btn==fivebtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "5");
			}
		if (btn==sixbtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "6");
			}
		if (btn==sevenbtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "7");
			}
		if (btn==eightbtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "8");
			}
		if (btn==ninebtn){
			equalchecker(hasequalbeenhit,screen);
			screentextsave=screen.getText();
			screen.setText(screentextsave + "9");
			}


		if (btn==plusbutton){
			buttonsave="+";
			inputnumber1=Double.parseDouble(screen.getText());
			screen.setText("");
		}
		if (btn==minusbutton){
			buttonsave="-";
			inputnumber1=Double.parseDouble(screen.getText());
			screen.setText("");
		}
		if (btn==dividebutton){
			buttonsave="/";
			inputnumber1=Double.parseDouble(screen.getText());
			screen.setText("");
		}
		if (btn==timesbutton){
			buttonsave="*";
			inputnumber1=Double.parseDouble(screen.getText());
			screen.setText("");
		}
		if (btn==clearbtn){
			buttonsave="c";
			inputnumber1=0;
			inputnumber2=0;
			screen.setText("");
			answersave=0;
			finalanswer="";
		}
		if (btn!=equalsbtn) hasequalbeenhit=false;
		}catch(NumberFormatException operationwithoutnumber){
			System.out.println("please do not hit an operation without entering a number");
		}
	}
	public void equalchecker(boolean check,TextField screen){
		if (check){
			screen.setText("");
		}		
	}
}



