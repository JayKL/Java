class Accounts{
	public Accounts(){
		System.out.println("a");	
	}
	public Accounts(int a){
		this();
		System.out.println("b");
	}
	public Accounts(int a, int b){
		this(a);
		System.out.println("c");
	}



}