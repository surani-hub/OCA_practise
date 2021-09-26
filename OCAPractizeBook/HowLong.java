import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class HowLong{
	
	public static void seasons(String... names){
		int l = names[1].length();
		System.out.println(names[l]);
	}
	
	public static void main(String[] args){
		
		/*
		String[] nycTourLoops = new String[]{"Downtown","Uptown","Brooklyn"};
		String[] times = new String[]{"Day","Night"};
		
		for(int i=0,j=0;i<nycTourLoops.length;i++,j++)
			System.out.println(nycTourLoops[i]+" "+times[j]);
		*/
		
			seasons("summer","fal","winter","spring");
		
		String bike1 = "speedy";
		String bike2 = new String("speedy");
		
		boolean test1 = bike1 == bike2;
		boolean test2 = bike1.equals(bike2);
		
		System.out.println(test1 +" "+ test2);
		
		System.out.println("***************************************************");
		/*
		LocalDate newYears = new LocalDate(2017,1,1);
		Period period = Period.ofYears(1).ofDays(1);
		
		DateTimeFormat format = DateTimeFormat.ofPattern("MM-dd-yyyy");
		
		System.out.println(format.format(newYears.minus(period)));
		*/
		
		/*
		int fish = 1+2*5>=2 ? 4 : 2;
		int mammals = 3<3 ? 1 : 5>=5 ? 9 : 7;
		
		System.out.println(fish+mammals+"");
		*/
		
		Arrays.sort(args);
		
		int result = Arrays.binarySearch(args, args[3]);
		System.out.println(result);
		
		
	}
}