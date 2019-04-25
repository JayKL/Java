class NumberChecker{
	public static void main(String xyz[]){
		float No;
		No=4000f;
		if (No>1000)
		{
			System.out.println("A");
			if (No>2000) {
				System.out.println("B");
				if (No>5000) System.out.println("G");
				else System.out.println("I");
			}
			else System.out.println("D");
		}
		else {
			System.out.println("C");
			if (No>500) System.out.println("E");
			else System.out.println("F");
		}

	}
}