public final class Clownfish extends Fish{
	public final Clownfish getFish(){
		throw new RuntimeException("clown!");
	}
	
	public static void main(String[] args) throws BubbleException{
		final Fish f = new Clownfish();
		f.getFish();
		System.out.println("swim!");
	}
}