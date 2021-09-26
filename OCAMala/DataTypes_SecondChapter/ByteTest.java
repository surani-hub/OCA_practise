class ByteTest{
	public static void main(String[] args){
		final byte age1 = 10;
		final byte age2 = 20;
		
		short sum = age1 + age2;
		
		int a = 20;
		int b = 10;
		
		/* int c = a - --b;
		
		System.out.println(c); // 9
		System.out.println(b); // 11 */
		
		System.out.println(b++ + b + b-- - b-- + ++b);
		
		System.out.println(++b + b + --b - --b + b++);
		
	}
}