import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.*;

class DateTimeFormatterTest{
	public static void main(String[] args){
		
		// -----------------Formating Date object using ofLocalizedDate() 
		/*
		LocalDate date = LocalDate.of(2057,8,11);
		
		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(dateFormatter1.format(date)); // Saturday, August 11, 2057
		System.out.println(dateFormatter2.format(date)); // 11-Aug-2057
		System.out.println(dateFormatter3.format(date)); // 11 August 2057
		System.out.println(dateFormatter4.format(date)); // 11/08/2057
		*/
		
		// ------------ Formatting Time object using ofLocalizedTime()
		/*
		LocalTime time = LocalTime.of(14,30,15);
		
		DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
		DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
		DateTimeFormatter timeFormatter3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter timeFormatter4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		
		// System.out.println(timeFormatter1.format(time)); // DateTimeException at runtime
		// System.out.println(timeFormatter2.format(time)); // DateTimeException at runtime
		System.out.println(timeFormatter3.format(time)); // 2:30:15 PM
		System.out.println(timeFormatter4.format(time)); // 2:30 PM
		*/
		
		// --------------- Formatting DateTime object using ofLocalizedDateTime()
		/*
		LocalDateTime dateTime = LocalDateTime.parse("2057-08-11T14:30:15");
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		// System.out.println(dateTimeFormatter1.format(dateTime)); // Saturday, August 11, 2057
		// System.out.println(dateTimeFormatter2.format(dateTime)); // 11 August 2057
		System.out.println(dateTimeFormatter3.format(dateTime)); // 11-Aug-2057, 2:30:15 pm
		System.out.println(dateTimeFormatter4.format(dateTime)); // 11/08/2057, 2:30 pm
		*/
		
		// ------ Formatting Date object using ofPattern()
		/*
		LocalDate date = LocalDate.of(2057,8,11);
		LocalTime time = LocalTime.of(14,30,15);
		
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y"); // year - 2057
		DateTimeFormatter d2 = DateTimeFormatter.ofPattern("yyyy"); // year - 2057
		DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y"); // year - 2057
		DateTimeFormatter d4 = DateTimeFormatter.ofPattern("YYYY"); // year - 2057
		
		System.out.println(d1.format(date));
		System.out.println(d2.format(date));
		System.out.println(d3.format(date));
		System.out.println(d4.format(date));
		
		DateTimeFormatter d5 = DateTimeFormatter.ofPattern("M"); // month - 8
		DateTimeFormatter d6 = DateTimeFormatter.ofPattern("D"); // which day of year - 223th day
		DateTimeFormatter d7 = DateTimeFormatter.ofPattern("d"); // day of month - 11
		DateTimeFormatter d8 = DateTimeFormatter.ofPattern("E"); // day of week - saturday
		DateTimeFormatter d9 = DateTimeFormatter.ofPattern("e"); // localised day of week - 7
		
		System.out.println(d5.format(date));
		System.out.println(d6.format(date));
		System.out.println(d7.format(date));
		System.out.println(d8.format(date));
		System.out.println(d9.format(date));
		
		DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H"); // 14
		DateTimeFormatter t2 = DateTimeFormatter.ofPattern("h"); // clock hour - 02
		DateTimeFormatter t3 = DateTimeFormatter.ofPattern("m"); // 30
		DateTimeFormatter t4 = DateTimeFormatter.ofPattern("s"); // 15
		
		System.out.println(t1.format(time));
		System.out.println(t2.format(time));
		System.out.println(t3.format(time));
		System.out.println(t4.format(time));
		*/
		
		/*
		DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
		System.out.println(formatter5);
		*/
		
		// where can spiral binding be done near this study center?
		
		
	}
}