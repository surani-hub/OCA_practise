class WhileTest{
	public static void main(String[] args){
		int x = 2;
		
		while(x == 2){
			System.out.println(x);
			x++;
			System.out.println(x);
		}
		
		while(x > 8){
			System.out.println("in the loop");
			x = 10;
		}
		
		System.out.println("past the loop");
		
		do{
			System.out.println("Inside the loop");
		} while(false);
		
		doStuff();
	}
	
	static boolean doStuff(){
		for(int x = 0; x < 3; x++){
			System.out.println("in for loop");
			return true;
		}
		return true;
	}
}