class evenchecktwo{
	public static void main(String xyz[]){
		int A=1;
		int Evencount=0;
		while (A<=10){
		System.out.println(A);
		if ( A % 2 ==0){
			System.out.println("Even");
			System.out.println("Number of even numbers: " + ++Evencount);
		}
		else System.out.println("Odd");
		A++;
		}
	}
	
}