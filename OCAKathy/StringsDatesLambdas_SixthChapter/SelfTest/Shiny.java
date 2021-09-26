import java.time.*;
import java.time.format.*;

class Shiny{
	public static void main(String[] args){
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		
		LocalDate d = LocalDate.of(2018, Month.JANUARY, 15);
		LocalDate d2 = d.plusDays(1);
		
		System.out.print(d.format(f1) + " ");
		System.out.println(f1.format(d2));
	}
}