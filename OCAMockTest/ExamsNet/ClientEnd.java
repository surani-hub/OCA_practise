public class ClientEnd{
	public static void main(String... motto){
		AOne a = new AOne();
		BOne b = new BOne();
		
		System.out.println(a.greeting() + " "+ a.getName());
		System.out.println(b.greeting() + " "+ b.getName());
		
	}
}	