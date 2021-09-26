import java.time.*;

public class OnePlusOne{
	public static void main(String[] args){
		String[] balls = new String[1];
		
		int[] score = new int[1];
		
		balls = null;
		score = null;
		
		int count = 0;
		
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);
		while(date.getMonth() != Month.APRIL){
			date = date.minusMonths(1);
			 count++;
		}
		
		System.out.println(count);
	}
}