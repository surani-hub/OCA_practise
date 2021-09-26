import java.util.Random;

class AnimalOne{
	String name;
	
	AnimalOne(String name){
		this.name = name;
	}
	
	AnimalOne(){
		this(makeRandomName());
	}
	
	
	static String makeRandomName(){
		int x = (int) (Math.random()*5);
		
		String name = new String[]{"Fluffy", "Gegi", "Fido", "Spike", "Rover"}[x];
		return name;
	}
	
	public static void main(String[] args){
		AnimalOne animal =  new AnimalOne();
		System.out.println(animal.name);
		
		AnimalOne b = new AnimalOne("Zeus");
		System.out.println(b.name);
		
	}
}