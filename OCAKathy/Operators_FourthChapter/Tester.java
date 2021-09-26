class Tester{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof Foo);
		System.out.println(b instanceof A);
		System.out.println(b instanceof Foo);
		
	}
}