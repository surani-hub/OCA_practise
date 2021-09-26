public class SS{
	
	/*
	int x , y;
	
	public SS(int x, int y){
		initialize(x,y);
	}
	
	public void initialize(int x, int y){
		this.x = x * x;
		this.y = y * y;
	}
	*/
	
	public static void main(String[] args){
	
		/*
		int x=3, y=5;
		SS obj = new SS(x,y);
		System.out.println(x+" " + y);
		*/
		
	int[] array = {10,20,30,40,50};
	int x = array.length;
	
	/*
	do{
		
		System.out.println(array[x]);
		--x;
		
	}while(x>=0);
	*/
	
	while(x>0){
		// x--;
		System.out.println(array[--x]);
	}
	}
}