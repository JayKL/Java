class switchexample{
	public static void main(String xyz[]){
		int Regno;
		Regno=12;
		switch(Regno){
			case 1:System.out.println("go home");break;
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
			case 13: System.out.println("Client=IBM");break;			
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
			case 12: System.out.println("Client=Microsoft");break;			
		}	
	}
}