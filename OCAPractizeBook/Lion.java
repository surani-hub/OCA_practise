public class Lion extends BigCat{
	public void roar(){
		System.out.println("Roar!!!");
	}
	
	public static void main(String[] args){
		final BigCat kitty = new Lion();
		kitty.roar(2);
	}
}