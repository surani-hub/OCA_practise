class OperatorPrecedence{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		int c = (a * (b + 2)) - 10 - 4 * ((2 * 2) - 6);
		
		System.out.println(c);
	}
}