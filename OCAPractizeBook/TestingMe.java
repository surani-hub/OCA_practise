import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class TestingMe{
	
	/*
	public static void print(List<String> list, Predicate<Integer> p){
		for(String num : list)
			if(p.test(num))
				System.out.println(num);
		
	}
	*/
	
	public static void main(String... getLost){
	
		List<String> magazines = new ArrayList<>();
		magazines.add("Digest");
		magazines.add("People");
	
		magazines.clear();
		
		magazines.add("Economist");
		
		magazines.remove(1);
		
		System.out.println(magazines.size());
	
	/*
	List<Character> chars = new ArrayList<>();
	
	chars.add('a');
	chars.add('b');
	System.out.println(chars);
	
	chars.set(1,'c');
	System.out.println(chars);
	
	chars.remove(0);
	System.out.println(chars);
	
	System.out.println(chars.size() + " " + chars.contains('b'));
	*/
	
	/*
	List<Integer> pennies = new ArrayList<>();
	pennies.add(3);
	pennies.add(2);
	pennies.add(1);
	
	pennies.remove(2);
	
	System.out.println(pennies);
	*/
	
	/*
	List<String> pennies = new ArrayList<>();
	pennies.add("-5");
	pennies.add("0");
	pennies.add("5");
	
	print(pennies, e -> e < 0);
	*/
	
	// List frisbee = new ArrayList<>();
	
	// List frisbee = new Object();
	}
}