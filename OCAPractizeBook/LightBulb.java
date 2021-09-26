public class LightBulb implements Source{
	public void flipSwitch(){
		try{
			throw new RuntimeException("Circuit Break!");
		}finally{
			System.out.println("Flipped!");
		}
	}
	
	public static void main(String[] meow) throws Throwable{
		final Source bulb = new LightBulb();
		bulb.flipSwitch();
	}
}