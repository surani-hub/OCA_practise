class Apple extends Fruit{
	public static void main(String[] args){
		Fruit f = new Apple();
		m2(f);
		
		Apple apple = new Apple();
		
		if(apple instanceof Object){
			System.out.println("apple is definitely an object");
		}
	}
	
	public static void m2(Fruit a){
		if(a instanceof Apple){
			((Apple)a).doAppleStuff();
		}
	}
	
	public static void doAppleStuff(){
		System.out.println("'Apple' belongs to Fruit category");
	}
}