class main{
	public static void main(String xyz[]){
			changechecker X;
			X = new changechecker(); 
			X.showdetails(100,12);		
	}	
}


class changechecker{
	public void showdetails(int paid, int bill){
		int change;
		int amountleft;
		int amountof50,amountof20,amountof10,amountof5,amountof2;
		// bill=12;
		// paid=100;
		change=paid-bill;
		System.out.println("amuont of change to be given = " + change);
		if (change>=50){
			amountof50=change/50;		
			amountleft=change%50;
			System.out.println("Amount of 50s = " + amountof50);
			// System.out.println("Amount left = " + amountleft);
		}
		else amountleft=change;
		
		if (change>=20){
			amountof20=amountleft/20;		
			amountleft=amountleft%20;
			System.out.println("Amount of 20s = " + amountof20);
			// System.out.println("Amount left = " + amountleft);			
		}
		else amountleft=change;
		
		if (change>=10){
			amountof10=amountleft/10;		
			amountleft=amountleft%10;
			System.out.println("Amount of 10s = " + amountof10);
			// System.out.println("Amount left = " + amountleft);
		}
		else amountleft=change;
	
		if (change>=5){
			amountof5=amountleft/5;		
			amountleft=amountleft%5;
			System.out.println("Amount of 5s = " + amountof5);
			// System.out.println("Amount left = " + amountleft);
		}		else amountleft=change;

				if (change>=2){
			amountof2=amountleft/2;		
			amountleft=amountleft%2;
			System.out.println("Amount of 2s = " + amountof2);
			// System.out.println("Amount left = " + amountleft);
		}		else amountleft=change;
		
		if (amountleft==1){
			System.out.println("Amount of 1s = " + 1);
			// System.out.println("Amount left = " + 0);
		}
	}
}
