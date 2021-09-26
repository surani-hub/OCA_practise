class IntTest{
	public static void main(String[] args){
		int a = 7, b = 10, c = 8;
		
		a = b = c;
		
		System.out.println(a);
		
		char c1 = 122;
		char c2 = '\u0122';
		
		System.out.println(c1 + " " + c2 );
		
		char a1 = 'a';
		
		System.out.println(a1);
		System.out.println(a1 + a1);
		
		System.out.println(a1 - a1);
	}
}