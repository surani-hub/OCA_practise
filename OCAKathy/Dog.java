class Dog extends Animal {
	public void eat(){
		System.out.println("Dog eats bones, meat");
	}
	
	public static void main(String[] args){
		Animal a = new Dog();
		Dog d = new Dog();
		
		// a.eat(); // eat() method in Dog should throw or catch exception as specified in SuperClass Animal class
		d.eat();
		
	}
}

