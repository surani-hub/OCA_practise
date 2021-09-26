public class Cowboy{
	private int space = 5;
	private double ship = space<2 ? 1 : 10;
	
	public void printMessage(){
		if(ship>1){
			System.out.println("Goodbye");
		}
		if(ship<10 && space>=2)
			System.out.println("Hello");
		else
			System.out.println("See you again");
	}
	
	public static void main(String[] args){
		new Cowboy().printMessage();
	}
	
}