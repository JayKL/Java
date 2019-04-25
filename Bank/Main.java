class Main{
	public static void main(String xyz[]){
		Bank HSBC,Barclays,Natwest;
		HSBC=new Bank();
		HSBC.setDollar(55);
		HSBC.amount(1);
		Barclays=new Bank();
		Barclays.amount(2);
		// Barclays.setDollar(100);
		Natwest = new Bank();
		Natwest.amount(3);
		// Natwest.setDollar(120);
	}
}