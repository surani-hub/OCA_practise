public class PepperoniPizza extends Pizza{
	public final void addTopping(String topping){
		System.out.println("can not add topping");
	}
	
	public void removeTopping(String topping){
		System.out.println("can not remove pepperoni");
	}
	
	public static void main(String[] args){
	Pizza pizza = new PepperoniPizza();
	pizza.addTopping("mushroom");
	pizza.removeTopping("pepperoni");
	}
}