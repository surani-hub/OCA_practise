import java.util.*;

public class Pizza{
	
	ArrayList toppings;
	
	public  void addTopping(String topping){
		toppings.add(topping);
	}
	
	public void removeTopping(String topping){
		toppings.remove(topping);
	}
	
}