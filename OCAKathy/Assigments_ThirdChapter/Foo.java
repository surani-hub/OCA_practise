class Foo{
	static int size = 7;
	
	static void changeIt(int size){ // size = 7
		size = size + 200; // size = 207
		System.out.println("size in changeIt is " + size); // 207
	}
	
	public static void main(String[] args){
		Foo f = new Foo();
		System.out.println("size = "+size); // static size = 7
		
		changeIt(size); // 207
		System.out.println("size after changeIt is "+size); // 7
	}
}