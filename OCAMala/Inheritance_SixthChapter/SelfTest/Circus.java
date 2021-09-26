class Circus{
	public static void main(String[] args){
		
		AnimalOne cat = new Cat();
		cat.jump(); // Animal
		
		Rabbit rabbit = new Rabbit();
		rabbit.jump(); // rabbit
		
		Cat catOne = new Cat();
		catOne.jump(); // Animal
		catOne.jump(10); // cat
		
		AnimalOne two = new Rabbit();
		two.jump(); //rabbit
	}
}