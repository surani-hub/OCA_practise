import java.time.LocalTime;

public class Equality{
	public static void main(String[] args){
		
		System.out.println(new StringBuilder("Zelda") == new StringBuilder("zelda")); // false
		System.out.println(3 == 3); // true
		System.out.println("bart" == "bart"); // true
		System.out.println(new int[0] == new int[0]); // false
		System.out.println(LocalTime.now() == LocalTime.now()); // false
		
		
	}
}	