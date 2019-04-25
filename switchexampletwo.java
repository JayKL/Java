class switchexampletwo{
	public static void main(String xyz[]){
		int Regno;
		int value;
		Regno=5;
		value=4;
		switch (value){
			case 1:Regno=1;
			case 5:
			case 6:
			switch(Regno){
			case 1:System.out.println("death");break;
			case 2:
			case 3:System.out.println("fail");break;
			case 4:
			case 5:System.out.println("succeed");break;
			case 6:System.out.println("win");break;
		};break;
		case 2: Regno=6;
		case 3:switch(Regno){
			case 1:System.out.println("death");break;
			case 2:
			case 3:System.out.println("fail");break;
			case 4:
			case 5:System.out.println("succeed");break;
			case 6:System.out.println("win");break;
		};break;
		case 4: System.out.println("huh");
		
		
		}
	}
}