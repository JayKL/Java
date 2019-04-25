abstract class Bank{
	int amount;
	public void showBalance(){
		System.out.println("Your current balance is: " + amount);
	}
	abstract public void deposit(int x);
	abstract public void withdraw(int x);
}