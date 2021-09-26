public class Wow{
	public static void go(short n){
		System.out.println("short ");
	}
	
	public static void go(Short n){
		System.out.println("Short ");
	}
	
	public static void go(Long n){
		System.out.println("Long ");
	}
	
	
	
	public static void main(String[] args){
		Short y = 6;
		int z = 7;
		
		go(y); // Short
		// go(z); // 
	}
}