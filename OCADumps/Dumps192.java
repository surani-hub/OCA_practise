import java.util.ArrayList;
import java.lang.Integer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDate;

public class Dumps192{
	public static void main(String[] args){
		ArrayList<Integer> points = new ArrayList<>();
		
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		
		points.remove(1);
		points.remove(null);
	
		System.out.println(points);
		
		List colors = new ArrayList();
		
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		
		colors.remove(2);
		colors.add(3, "cyan");
		
		System.out.println(colors);
		
	int n [][] = {{1,3},{2,4}};
	
	for(int i = n.length-1; i>=0;i--){
		for(int y :n[i]){
			System.out.println(y);
		}
	}
	
	int nums1[] ={1,2,3};
	int nums2[] = {1,2,3,4,5};
	
	nums2 = nums1;
	
	for(int x: nums2){
			System.out.println(x+" :");
	}
	
	
	LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
	dt.plusDays(30);
	dt.plusMonths(1);
	
	System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	
	
	LocalDate date = LocalDate.of(2012,01,32);
	date.plusDays(10);
	
	System.out.println(date);
	
	
	}
}