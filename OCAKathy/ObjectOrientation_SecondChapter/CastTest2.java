class CastTest2{
	public static void main(String[] args){
		Animal[] a = {new Animal(), new Dog(), new Animal()};
		
		for(Animal animal:a){
			animal.makeNoise();
			
			if(animal instanceof Dog){
				Dog d = (Dog) animal;
				d.playDead();
			}
		}
	}
}

// Generic noise
// bark
// roll over
// generic noise

