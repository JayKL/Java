class Accounts{
	public float tax(int Salary){
		float T;
		T=0;
		if (Salary<1000){
			T=Salary*15f/100;
		}
		if (Salary>=1000){
			T=Salary*20f/100;
		}
		if (Salary>=2000){
			T=Salary*25f/100;
		}
		return T;
	}
}