class IncOperators{
	
	static int players = 0;
	
	public static void main(String[] args){
		System.out.println("players online: " + players++);
		System.out.println("The value of players is " + players);
		System.out.println("The value of players is now " + ++players);
		
		int x = 2;
		int y = 3;
		
		if((y == x++) | (x < ++y)){
		}
		
		
	}
}