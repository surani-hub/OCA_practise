import java.util.*;
import java.util.function.Predicate;

public class TestPerson{
	public static void main(String[] args){
		
		List<Person> iList = Arrays.asList(
								new Person("Hank",45),
								new Person("Charlie",40),
								new Person("Smith",38)
								);
								
			
			//checkAge(iList, p -> p.getAge() > 40); -- working
			
			// checkAge(iList, Person p -> p.getAge() > 40); - compile time error
			
			// checkAge(iList, (Person p) -> { return p.getAge() > 40;});-- working with return
	}
	
	public static void checkAge(List<Person> list, Predicate<Person> predicate){
		for(Person p: list){
			if(predicate.test(p)){
				System.out.println(p.name + " ");
			}
		}
	}
	
	
}