public class Base{

	public static final String FOO = "foo";
	
	public static void main(String[] args){
		Base b = new Base();
		SubBase s = new SubBase();
		
		System.out.println(Base.FOO); // foo
		System.out.println(SubBase.FOO); // bar
		System.out.println(b.FOO); // foo 
		System.out.println(s.FOO); // bar
		
		System.out.println(((Base)s).FOO); // foo
		
	}
}