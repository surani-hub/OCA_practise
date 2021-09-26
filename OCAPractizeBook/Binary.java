import java.util.Arrays;
import java.util.*;

public class Binary{
	
	public int drive(long car){
		return 2;
	}
	
	public int drive(double car){
		return 3;
	}
	
	public int drive(int car){
		return 5;
	}
	
	public int drive(short car){
		return 3;
	}
		
	public static void main(String[] args){
		
		float value = 5;
		
		System.out.println(new Binary().drive(value));
		
		
		/*
		args = new String[]{"0","1","01","10"};
		
		Arrays.sort(args);
		
		System.out.println(Arrays.toString(args));
		
		List<String> exams = Arrays.asList("OCA","OCP");
		for(String e1: exams)
			for(String e2: exams)
				System.out.println(e1+" "+ e2);
		
		System.out.println();
		
		System.out.println("*********************************************");
		
		//char one = Integer.parseInt("1");
		//Character two = Integer.parseInt("2");
		int three = Integer.parseInt("3");
		Integer four = Integer.parseInt("4");
		//short five = Integer.parseInt("5");
		//Short six = Integer.parseInt("6");
		*/
		
	}
}