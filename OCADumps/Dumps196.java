public class Dumps196{
	public static void main(String[] args){
		//int x = 5;
		
		int x = 6;
		
		while(isAvaiable(x)){
			//System.out.println(x);
			System.out.println(--x);
			// x--;
		}
		
		
	}
	
	public static boolean isAvaiable(int x){
		//return x-->0 ? true : false;
		return --x>0 ? true : false;
	}
}