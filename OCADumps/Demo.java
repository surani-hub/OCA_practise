import java.time.*;
import java.time.format.DateTimeFormatter;

class Demo{
	public static void main(String[] args){
	
	// DVD dvd = new DVD(10,20);
	
	int[] a = {1,2,3,4,5};
	
	for(int e = 0 ; e< 5; e +=2){
		System.out.println(a[e]);
	}
	
	/*
	Short s1 = 200;
	Integer s2 = 400;
	Long s3 = (long)s1 + s2;
	// String s4 = (String) (s3 * s2);
	
	System.out.println("sum is " + s3);
	*/
	
	/*
	int aVar = 9;
	
	if(aVar++ < 10){
		System.out.println(aVar + "Hello World!");
	} else {
		System.out.println(aVar + "Hello Universe!");
	}
	*/
	
	/*
	String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
	
	System.out.println(date);
	*/
	
	}
}