class main{
		public static void main(String xyz[]){
			Line l=new Line();
			letsDraw(l);
			Circle c=new Circle();
			letsDraw(c);
		}
		public static void letsDraw(Drawing ref){
			ref.drawSomething();
		}
}
