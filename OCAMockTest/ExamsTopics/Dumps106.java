public class Dumps106{

	int x;
	int y;
	
	public Dumps106(int x, int y){
		initialise(x,y);
	}
	
	public void initialise(int x, int y){
		this.x = x*x;
		this.y = y*y;
	}
	
	
	
	public static void main(String[] args){
		int x = 3, y = 5;
		Dumps106 obj = new Dumps106(x,y);
		
		System.out.println(x + " " + y);
		System.out.println(obj.x + " " + obj.y);
	}
}