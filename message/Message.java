class Message{
		public void printMessage(String N){
			System.out.println(N);
			System.out.println(N.length());
			System.out.println(N.substring(3,N.length()));		
		}
		public void printMessage2(String n){
			int i;
			for (i=0;i<n.length();i++){
					System.out.println(n.substring(i,i+1));
			}			
		}
		
}