class nestedwhilethree{
	public static void main (String xyz[]){
		int A,B;
		A=1;
		while (A<=10) {
			if (A % 2 ==0) {
				B=1;
				System.out.print("\n");
				while (B<=A){
					System.out.print(B + " ");
					B=B+1;
				}
			}
			else 
			{
				System.out.println("\n");
				System.out.println(A);
			}
			A=A+1;
		}
	}
}