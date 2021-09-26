class Frog{
	static int frogCount;
	
	public Frog(){
		frogCount += 1;
	}
	
	public static void main(String[] args){
		new Frog();
		new Frog();
		new Frog();
		
		System.out.println("Frog count is now "+ frogCount);
	}
}