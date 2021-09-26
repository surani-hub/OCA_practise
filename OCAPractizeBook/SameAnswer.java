import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class SameAnswer{
	public static void main(String[] args){
		
		/*
		String[] array = {"Natural History","Science"};
		
		List<String> musems = Arrays.asList(array);
		
		System.out.println(musems);
		
		musems.set(0,"Art");
		System.out.println(musems);
		
		System.out.println(musems.contains("Natural History"));
		*/
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		System.out.println(sb); // red
		
		sb.deleteCharAt(0); 
		System.out.println(sb); // ed
		
		sb.delete(1,2);
		System.out.println(sb); // e
		
		System.out.println(sb);
		*/
		
		
		System.out.println("----------------------------------------------------");
		
		LocalDate newYears = LocalDate.of(2017,1,1);
		Period period = Period.ofDays(1);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");
		System.out.println(format.format(newYears.minus(period)));
		
		/*
		StringBuilder sb = new StringBuilder("radical ");
		
		StringBuilder sb1 = new StringBuilder("radical ");
		
		StringBuilder sb2 = new StringBuilder("radical ");
		
		StringBuilder sb3 = new StringBuilder("radical ");
		
		
		sb = new StringBuilder("radical ").append("robots");
		
		sb1 = new StringBuilder("radical ").delete(1,100).append("obots").insert(1,"adical r");
		
		sb2 = new StringBuilder("radical ").insert(7,"robots");
		
		sb3 = new StringBuilder("radical ").insert(sb3.length(), "robots");
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		*/
		
	}
}