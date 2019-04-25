abstract class Drawing{
	abstract public void drawSomething();
}

class Line extends Drawing{
	public void drawSomething(){
	System.out.println("Drawing line");	
	}	
}

class Circle extends Drawing{
	public void drawSomething(){
		System.out.println("Drawing Circle");
	}	
}