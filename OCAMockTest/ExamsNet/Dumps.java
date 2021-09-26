import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dumps{
	public static void main(String[] args){
	
	/*
	int[] data = {2010,2013,2014, 2015,2014};
	int key= 2014;
	int count =0;
	
	for(int e: data){
		if(e != key){
			count++;
			continue;
			
		}
	}
	
	System.out.println(count + " found");
	*/
	
	String[] names = {"Thomas","Peter","Joseph"};
	String[] pwd = new String[3];
	int idx =0;
	
	try{
		for(String n: names){
			pwd[idx] = n.substring(2,6);
			idx++;
		}
	}catch(Exception e){
		System.out.println("Invalid Name");
	}
	
	for(String p:pwd){
		System.out.println(p);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
	dt.plusDays(30);
	dt.plusMonths(1);
	
	System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	*/
	
	}
}