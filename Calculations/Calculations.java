class Calculations{
	public static void main(String abc[]){
		int a,b,c;
		a=b=c=0;
		try{
			a = Integer.parseInt(abc[0]);
			b = Integer.parseInt(abc[1]); 
			c=a/b;
			System.out.println("the result is " + c);
		} catch(ArithmeticException X) {
			System.out.println("you cannot divide by zero");
		} catch(ArrayIndexOutOfBoundsException Y) {
			System.out.println("please send two numbers");	
		} catch(NumberFormatException X) {
			System.out.println("please enter integers");	
		} catch(Exception X) {
			System.out.println("Something went wrong");
		}
	
	}
}