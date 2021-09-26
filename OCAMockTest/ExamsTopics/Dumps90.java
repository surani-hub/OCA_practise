public class Dumps90{
	public static void main(String[] args){
		Dumps90 ts = new Dumps90();
		System.out.println(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	
	public static boolean doStuff(){
		return !isAvailable;
	}
	
	static boolean isAvailable = false;
}