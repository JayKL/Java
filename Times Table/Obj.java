class Obj{
		void timesTable(int a){
		int b=1,c=0;
		while (b<=10){
		c=a*b;
		System.out.println(a + " times " + b++ + " = " + c );
		}
		}
		void timesTable2(int t, int r){
		int b=1,c=0;
		while (b<=r){
		c=t*b;
		System.out.println(t + " times " + b++ + " = " + c );
		}
		}
		void timesTable3(int t1,int t2){
		int b=1,c=0,d=t1;
		while (d<=t2){
		System.out.println("---------------Times Table of " + d++ );
		while (b<=10){
		c=d*b;
		System.out.println(d + " times " + b++ + " = " + c );
		}
		b=1;
		}
		}
}