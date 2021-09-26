public class App{
	public static void main(String[] args){
		Boolean[] bool = new Boolean[2];
		
		bool[0] = new Boolean(Boolean.parseBoolean("false"));
		bool[1] = new Boolean(false);
		
		System.out.println(bool[0] + " " + bool[1]);
	}
}