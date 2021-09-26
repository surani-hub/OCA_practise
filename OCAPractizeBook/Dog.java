public class Dog implements Friend{
	public String getName() throws RuntimeException{
		return "Doggy";
	}
	
	public static void main(String[] args){
		Friend friend = new Dog();
		
		// System.out.println(((Cat)friend).getName());
		// System.out.println(((Dog)null).getName());
		
	}
}