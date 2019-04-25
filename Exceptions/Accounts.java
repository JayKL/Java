class Accounts{
	public static void main(String xyz[]){
		Accounts QA = new Accounts();
		try{
			QA.tax(9500,10);
		} catch(AbsentyException e){
		
		System.out.println("Disciplinary needed");
		}
	
	
	}



	public void tax(int salary,int absenties) throws AbsentyException{
		float t=0;
		if (absenties>=5){
			AbsentyException e=new AbsentyException();
			throw e;
		}else {
			t=(float)salary*15/100;
			System.out.println(t);
		}
	}
}