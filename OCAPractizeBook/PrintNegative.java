import java.util.*;
import java.util.function.Predicate;

public class PrintNegative{
	public static void main(String[] args){
		
		int result = 8;
		
		loop: while(result > 7){
			result++;
			
			do{
				result--;
			}while(result > 5);
			
			break loop;
		}
		
		System.out.println(result);
		
		
		
		/*
		List<Integer> list = new ArrayList<>();
		
		list.add(-5);
		list.add(0);
		list.add(5);
		
		print(list, e -> e < 0);
		*/
	}
	
	/*
	public static void print(List<Integer> list, Predicate<Integer> p){
		for(Integer num:list)
			if(p.test(num))
				System.out.println(num);
	}
	*/
	
}