public class BlueCar extends Car{
	{
		System.out.println("4");
	}
	
	public BlueCar(){
		super("Blue");
		System.out.println("5");
	}
	
	public static void main(String[] args){
		new BlueCar();
	}
}