class Program{
	// static int x =20;
	
	static int x = 11;
	private int y = 33;
	
	public static void main(String[] args){
		
		/*
		Program pr = new Program();
		
		System.out.println(x);
		
		pr.x = 5;
		
		System.out.println(pr.x);
		
		System.out.println(x);
		
		int y = x/pr.x;
		
		System.out.println("y= " + y);
		*/
		
		Program pro = new Program();
		pro.method(5);
		
		
		System.out.println(Program.x);
		System.out.println(" " + pro.x);
		System.out.println(" " + pro.y);
		
		
	}
	
	public void method(int x){
		x = 10;
		y = 12;
	}
}