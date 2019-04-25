class Conversions{	
	public String decimalToBinary(int number){
			int binary;
			int numbersave=number;
			String binarysave = "";
			if (number==0){
				binarysave="0";
			}else{
			while (number!=1){
				binary=number%2;
				binarysave=binary + binarysave;
				number=number/2;
			}
			binarysave="1" + binarysave;
			}
			System.out.println(numbersave + " in binary: " + binarysave);
			return binarysave;
	}
	
	public int powerOfTwo(int tothepower){
		int finalvalue=1;
		for (int i=0;i<tothepower;i++){
				finalvalue=finalvalue*2;		
		}
		return finalvalue;
	}
	
	public int binaryToDecimal(String binarystring){
		int decimal=0;
		int lengthofstring=binarystring.length();
		for (int i=0;i<lengthofstring;i++){
			int currentbinary=Integer.parseInt(binarystring.substring(lengthofstring - i -1,lengthofstring-i));
			decimal=decimal + (this.powerOfTwo(i))*currentbinary;
		}
		return decimal;
	}
}