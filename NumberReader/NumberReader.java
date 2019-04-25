class NumberReader{
	public static void main(String xyz[]){
		NumberReader x=new NumberReader();
		int a =103;
		System.out.println("input integer is: " + a);
		x.numberReader(a);
		// x.switchForSingleD(4,"hi");
	}
	
	public String switchForSingleD(int digitinput, String stringinput){
		switch(digitinput){
			case 1: stringinput=stringinput + "one"; break;
			case 2: stringinput=stringinput + "two"; break;
			case 3: stringinput=stringinput + "three"; break;
			case 4: stringinput=stringinput + "four"; break;
			case 5: stringinput=stringinput + "five"; break;
			case 6: stringinput=stringinput + "six"; break;
			case 7: stringinput=stringinput + "seven"; break;
			case 8: stringinput=stringinput + "eight"; break;
			case 9: stringinput=stringinput + "nine"; break;
		}
		return stringinput;
	}

	public void numberReader(int input){
		if (input<10000 && input>=0){
			String numberasstring="";
			int firstd,secondd,thirdd,fourthd;
			firstd=secondd=thirdd=fourthd=0;
			String inputasstring;
			inputasstring=Integer.toString(input);
			if (input<10){
				inputasstring="0"+inputasstring;
				if (input==0){
					numberasstring="zero";
				}
			}
			if (input<100)
				{
				inputasstring="0"+inputasstring;
			}
			if (input <1000){
							inputasstring="0"+inputasstring;
			}
			System.out.println("Input number is detected as: " + inputasstring);
			firstd=Integer.parseInt(inputasstring.substring(3,4));
			secondd=Integer.parseInt(inputasstring.substring(2,3));
			thirdd=Integer.parseInt(inputasstring.substring(1,2));
			fourthd=Integer.parseInt(inputasstring.substring(0,1));
			numberasstring=switchForSingleD(fourthd,numberasstring);
			if (fourthd!=0){
				numberasstring=numberasstring + " thousand";
			if ((thirdd!=0 | secondd!=0) | firstd!=0 ){
				numberasstring=numberasstring + " and ";
			}
			}
			numberasstring=switchForSingleD(thirdd,numberasstring);
			if (thirdd!=0){
				numberasstring=numberasstring + " hundered";
			if (firstd!=0 | secondd!=0){
				numberasstring=numberasstring + " and ";
			}				
			}
			switch(secondd){
				case 0: break;
				case 2: numberasstring=numberasstring + "twenty "; break;
				case 3: numberasstring=numberasstring + "thirty "; break;
				case 4: numberasstring=numberasstring + "fourty "; break;
				case 5: numberasstring=numberasstring + "fifty "; break;
				case 6: numberasstring=numberasstring + "sixty "; break;
				case 7: numberasstring=numberasstring + "seventy "; break;
				case 8: numberasstring=numberasstring + "eighty "; break;
				case 9: numberasstring=numberasstring + "ninety "; break;
			}
			if (secondd!=1){
			numberasstring=switchForSingleD(firstd,numberasstring);
			} 
			else if (secondd==1){
					switch(firstd){
				case 1: numberasstring=numberasstring + "eleven"; break;
				case 2: numberasstring=numberasstring + "twelve"; break;
				case 3: numberasstring=numberasstring + "thirteen"; break;
				case 4: numberasstring=numberasstring + "fourteen"; break;
				case 5: numberasstring=numberasstring + "fifteen"; break;
				case 6: numberasstring=numberasstring + "sixteen"; break;
				case 7: numberasstring=numberasstring + "seventeen"; break;
				case 8: numberasstring=numberasstring + "eightteen"; break;
				case 9: numberasstring=numberasstring + "nineteen"; break;
			}
		}
		System.out.println(numberasstring);
		} else System.out.println("needs to be in the range of 0-9999");
	}
}