// import java.time.LocalDate;
import java.time.*;
import java.time.format.*;

class NiceDates{
	public static void main(String[] args){
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
		
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("k:m:s A a");
		
		LocalDate d = LocalDate.now();
		String s = d.format(f1);
		System.out.println(s);
		
		System.out.println(d.format(f2));
		
		LocalTime t = LocalTime.now();
		System.out.println(t.format(f3));
	}
}