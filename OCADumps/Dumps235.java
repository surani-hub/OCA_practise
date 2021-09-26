import java.time.LocalDate;


public class Dumps235{
	public static void main(String[] args){
		LocalDate date = LocalDate.of(2012,01,31);
		date = date.plusDays(10);
		System.out.println(date);
		
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;
		String s4 = (String)(s3 * s2);
		
		System.out.println("s3 = " + s3);
		System.out.println("sum is "+ s4);
		
/*
		LocalDate date2 = LocalDate.of(6,20,2014);
		System.out.println(date2);
*/
	}
}