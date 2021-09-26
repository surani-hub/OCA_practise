class BigCat{
	void roar(int level) throws RuntimeException{
		if(level>3)
			throw new IllegalArgumentException("Incomplete");
			System.out.println("Roar!");
	}
	
}