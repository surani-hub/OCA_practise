class Foo{
	public static void main(String[] args){
		int a = 10;
		long b = 20;
		short c = 30;
		
		System.out.println(++a + b++ * c); // 611
		System.out.println(b); // 21
		System.out.println(a); // 11
	}
}

