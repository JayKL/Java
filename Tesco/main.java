class main{
	public static void main(String xyz[]){
		Tesco Shop1,Shop2;
		Shop1=new Tesco();
		Shop1.qty=2;
		Shop1.price=1.25f;
		Shop1.calculate();
		Shop1.showdetails();
		
		Shop2=new Tesco();
		Shop2.qty=10;
		Shop2.price=5f;
		Shop2.calculate();
		Shop2.showdetails();
	
	}
}