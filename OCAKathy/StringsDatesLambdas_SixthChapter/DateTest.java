import java.time.*;

class DateTest{
	public static void main(String[] args){
		LocalDate d1 = LocalDate.of(2017, 1, 31);
		
		Period p1 = Period.ofMonths(1);
		
		System.out.println(d1);
		
		d1.plus(p1);
		
		System.out.println(d1);
		
		LocalDate d2 = d1.plus(p1);
		System.out.println(d2);
	}
}