import java.util.ArrayList;
import java.util.function.Predicate;

class Test{
	public static void main(String[] args){
		Emp e1 = new Emp("Shreya", 5, 9999.90);
		Emp e2 = new Emp("Paul", 4, 1234.00);
		Emp e3 = new Emp("Harry", 5, 8769.90);
		Emp e4 = new Emp("Selvan", 1, 2769.00);
		
		ArrayList<Emp> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);
		
		
		for(Emp emp: empArrList){
			System.out.println(emp);
		}
		
		System.out.println("After deleting");
		
		empArrList.removeIf(e -> e.getName().startsWith("H"));
		
		for(Emp emp: empArrList){
			System.out.println(emp);
		}
		
		/*
		Validate validatePerform = e -> e.getPerformanceRating() >= 5;
		filter(empArrList, validatePerform);
		
		//filter(empArrList, new ValidatePerformanceRating());
		
		validatePerform = e -> e.getSalary() > 9000.00;
		filter(empArrList, validatePerform);
		*/
		
		/*
		Validate validatePerform = e -> e.getName().startsWith("S");
		filter(empArrList, validatePerform);
		*/
		
		/*
		Predicate<Emp> predicate = e -> e.getPerformanceRating() >= 5;
		filter(empArrList, predicate);
		*/
		
	}
	
	// static void filter(ArrayList<Emp> emp, Validate rule){
		static void filter(ArrayList<Emp> emp, Predicate<Emp> rule){
			for(Emp e: emp){
			//if(rule.check(e)){
				if(rule.test(e)){
				System.out.println(e);
			}
		}
	}
}