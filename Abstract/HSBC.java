final class HSBC extends Bank{
	public void deposit(int b){
		amount+=b;
	}
	public void withdraw(int c){
	if (c<= amount){
		amount-=c;
	}else System.out.println("insufficient funds");
	}
}