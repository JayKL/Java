class college{
	private int phy,che;
	public void Physics(int A){
		if (A>=0 && A<=150){
			phy=A;			
		}
		else {
			phy=-1;
			System.out.println("Invalid Physics Marks");}
	}
	public void Chemistry(int A){
		if (A>=0 && A<=150){
			che=A;			
		}
		else {
			che=-1;
			System.out.println("Invalid Chemistry Marks");
		}
	}
	public void Showresults(){
		if (phy>=0 && che>=0){
			System.out.println("Physics: " + phy);
			System.out.println("Chemistry: " + che);
			System.out.println("Total: " + (che + phy));
			System.out.println("Percentage: " + ((che+phy)*100/300));
		}
	}
}