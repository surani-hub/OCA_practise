public class Helicopter extends Rotorcraft{
	private int height = 10;
	protected int fly(){
		return super.height;
	}
	
	public static void main(String[] args){
		Helicopter h = (Helicopter)new Rotorcraft(); // why ClassCastException
		/*
			Child class object can be created and stored in parent reference - possible;
			parent class object created and explicitly casted to child class and then stored in child reference - isn't it possible?
			
		*/
		System.out.println(h.fly());
	}
}