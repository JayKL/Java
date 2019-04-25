class Tesco{
	int qty;
	float price,vat,amount;
	public void calculate(){
		amount=qty*price;
		vat=amount*15/100;
	}
	public void showdetails(){
		System.out.println("Amount: " + amount);
		System.out.println("Vat: " + vat);
		System.out.println("Bill: " + (amount+vat));	
	}
}	