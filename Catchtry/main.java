class main{
		public static void main(String xyz[]){
			int r=0;
			main xe=new main();
			try{
				xe.divide(r);
				System.out.println("Result: " + r);
				
				
			}catch(ArithmeticException x){
				System.out.println("dividing by zero illegal");
			}
		}
		
		
		public void divide(int a)
		{
			a=a/0;
			System.out.println(a);
		}
}
