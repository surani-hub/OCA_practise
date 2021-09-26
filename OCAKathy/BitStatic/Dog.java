class Dog extends Animal{
	static void doStuff(){
		System.out.println("b");
	}
	
	public static void main(String[] args){
		Animal[] a = {new Animal(), new Dog(), new Animal()};
		
		for(int x = 0; x <a.length; x++){
			a[x].doStuff();
		}
		Dog.doStuff();
	}
}