import java.time.*;
import java.time.format.*;

public class Question35{
	public static void main(String[] args){
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2021,4,8);
		LocalDate date3 = LocalDate.parse("2021-04-08", DateTimeFormatter.ISO_DATE);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
	}
}