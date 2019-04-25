class Bank{
	static int dollar;
	static{
		dollar=92;
		System.out.println("-------- STATIC VARIABLE DOLLAR INITIALIZED --------");
	}
	public void setDollar(int d){
		dollar=d;		
	}
	public void amount(int a){
			System.out.println("Amount: " + (a*dollar));
	}
}