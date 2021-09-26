import java.time.*;

public class MockTest{
	public static void main(String[] args){
		Integer arr[] = {1,2,3,4};
		arr[0] = null;
		
		for(Integer a: arr)
			System.out.println(a);
			
			
		LocalDate date = LocalDate.of(2015,3,24);
		Period p = Period.ofDays(2);
		System.out.println(date.plus(p));
	}
}