class Second {

    public static void main(String xyz[]) {
		int Phy;
		int Che;
		int Mat;
		float Per;
		float Total;
		Phy=73;
		Che=99;
		Mat=112;
		Total=(float)Phy+Che+Mat;
		Per=(float)Total*100/450;
		System.out.println("Physics Marks: " + Phy);
		System.out.println("Chemistry Marks: " + Che);
		System.out.println("Mathematics Marks: " + Mat);
		System.out.println("-----------------------------------------------");
		System.out.println("Total Marks: " + Total);
		System.out.println("Percentage: " + Per);
		System.out.println("-----------------------------------------------");		
    }

}