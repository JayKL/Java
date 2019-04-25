class tree{
	public static void main(String xyz[]){
		Shop ASDA;
		ASDA=new Shop();
		ASDA.message();
		ASDA.price=1.25F;
		System.out.println(ASDA.qty);
		System.out.println(ASDA.qty*ASDA.price);	
	}
}