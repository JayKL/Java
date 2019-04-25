class Tax{
	public static void main(String xyz[]){
		float Salary,Tax,Net;
		Salary=1500f;
		Tax=0f;
		Net=0f;
		if (Salary<2000f)
		{
			Tax=Salary*10/100;
			Net=Salary-Tax;
		}
		else
		{
			Tax=Salary*21/100;
			Net=Salary-Tax;
		}
		
		
		System.out.println("Salary is: " + Salary);
		System.out.println("Tax is: " + Tax);
		System.out.println("Net is: " + Net);

	}
}