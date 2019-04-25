class main{
	public static void main(String xyz[]){
		int S;
		Accounts shafeeq;
		shafeeq=new Accounts();
		S=1789;
		System.out.println("Salary: " + S);
		System.out.println("Taxes: " + shafeeq.tax(S));
		System.out.println("Salary: " + (S - shafeeq.tax(S)));		
	}
}