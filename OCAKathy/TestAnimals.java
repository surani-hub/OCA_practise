class TestAnimals{
	public static void main(String[] args){
		Animal a = new Animal();
		Animal b = new Horse();
		
		a.eat(); // Animal version of eat method
		b.eat();  // Horse version of eat method
		// b.buck(); // not possible because it's expecting method of tybe Animal class
		
		Horse h = new Horse();
		h.eat();
		h.buck();
	}
}



