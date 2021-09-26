class Toy{
	public void play(){
		System.out.println("play-");
	}
	
	public void finalize(){
		System.out.println("clean-");
	}
	
	public static void main(String[] args){
		Toy car = new Toy();
		car.play();
		
		System.gc();
		
		Toy doll = new Toy();
		doll.play();
	}
}