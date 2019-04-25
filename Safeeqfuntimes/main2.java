class main2{
	public static void main(String xyz[]){
			// changechecker X;
			// X = new changechecker(); 
			// X.showdetails(200,12);		
			
			
			int number=112;
			int binary;
			String binarysave = "";
			// System.out.print("binary: ");
			while (number!=1){
				binary=number%2;
				binarysave=binary + binarysave;
				number=number/2;
			}
			binarysave="1" + binarysave;
			System.out.println(binarysave);
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
			change%=50;
			System.out.println("Amount of 50s = " + amountof50);
			// System.out.println("Amount left = " + amountleft);
		}
		//else amountleft=change;
		
		if (change>=20){
			amountof20=change/20;		
			change%=20;
			System.out.println("Amount of 20s = " + amountof20);
			// System.out.println("Amount left = " + amountleft);			
		}
		//else amountleft=change;
		
		if (change>=10){
			amountof10=change/10;		
			change%=10;
			System.out.println("Amount of 10s = " + amountof10);
			// System.out.println("Amount left = " + amountleft);
		}
		// else amountleft=change;
	
		if (change>=5){
			amountof5=change/5;		
			change%=5;
			System.out.println("Amount of 5s = " + amountof5);
			// System.out.println("Amount left = " + amountleft);
		}	
		// else amountleft=change;

				if (change>=2){
			amountof2=change/2;		
			change%=2;
			System.out.println("Amount of 2s = " + amountof2);
			// System.out.println("Amount left = " + amountleft);
		}	
		// else amountleft=change;
		
		if (change==1){
			System.out.println("Amount of 1s = " + 1);
			// System.out.println("Amount left = " + 0);
		}
	}
}

// class binarycheck{
	
			// public void 
				// int number=6;
			// int numbersave=number;
			// int binary;
			// System.out.print("binary: ");
			// for (int i=1;i<((numbersave/2) +1);i++){
				// binary=number%2;
				// System.out.print(binary);
				// System.out.println(i);
				// number=number/2;
				// System.out.println(number);
			// }
	
	
// }
