public class GammFoo{
	static Foo fooBar(Foo foo){
		foo = new Foo(100);
		return foo;
	}
	
	public static void main(String[] args){
		Foo foo = new Foo(300);
		System.out.println(foo.getX() + "-"); // 300
		
		Foo fooFoo = fooBar(foo);
		System.out.println(foo.getX() + "-");
		System.out.println(fooFoo.getX() + "-");
		
		foo = fooBar(fooFoo);
		System.out.println(foo.getX() + "-");
		System.out.println(foo.getX() );
	}
	
}