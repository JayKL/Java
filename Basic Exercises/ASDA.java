class ASDA {

    public static void main(String xyz[]) {
		int Quantity;
		float Price,Amount,Vat;
		Quantity=6;
		Price=1.75F;
		Amount=Quantity*Price;
		Vat=Amount*12/100;
		System.out.println("Price: " + Price);
		System.out.println("Quantity: " + Quantity);
		System.out.println("Amount: " + Amount);
		System.out.println("Vat: " + Vat);		
		System.out.println("Net Bill: " + (Amount + Vat));
    }

}