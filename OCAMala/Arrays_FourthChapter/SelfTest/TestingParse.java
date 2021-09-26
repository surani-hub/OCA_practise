import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class TestingParse{
	public static void main(String[] args){
		
		String printDate = LocalDate.parse("2057-08-11").format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(printDate);
	}
}