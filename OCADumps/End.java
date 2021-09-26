class End{
	public static void main(String[] args){
		End ts = new End();
		System.out.println(ts.isAvailable);
		
		isAvailable = ts.doStuff();
		
		System.out.println(isAvailable);
	}
	
	public static boolean doStuff(){
		return !isAvailable;
	}
	
	static boolean isAvailable = false;
}