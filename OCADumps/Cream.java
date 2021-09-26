import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Cream{
	public static void main(String[] args){
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2021,3,21);
		LocalDate date3 = LocalDate.parse("2021-03-21", DateTimeFormatter.ISO_DATE);
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);
		
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		
		String str2 = "Duke";
		
		System.out.println(str1 == str2);
		
	}
}