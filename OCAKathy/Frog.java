class Frog{
	int frogSize = 0;
	
	public int getFrogSize(){
		return frogSize;
	}
	
	public Frog(int size){
		frogSize = size;
	}
	
	public static void main(String[] args){
		Frog f = new Frog(25);
		System.out.println(f.getFrogSize());
	}
}