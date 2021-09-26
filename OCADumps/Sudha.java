import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Sudha{
	
	/*
	char c;
		boolean b;
		float f;
		
		void printAll(){
			System.out.println("c = " + c);
			System.out.println("b = " + b);
			System.out.println("f = " + f);
		}
		*/
		
		public static final int MIN = 1;
		
		public static boolean checkLimit(int x){
				return (x >= MIN) ? true : false;
		}
		
	public static void main(String[] args){
		
		int x = args.length;
		
		if(checkLimit(x)){
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
		
		/*
		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		
		for(int e : data){
			if(e != key){
				continue;
				count++;
			}
		}
		System.out.println(count + "Found");
		*/
		
		/*
		LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		*/
		
		/*
		int[] stack = {10,20,30};
		int size = 3;
		int idx = 0;
		
		do{
			idx++;
		}while(idx<size-1);
		
		System.out.println("The Top element" + stack[idx]);
		
		String myString = "Hello World";
		myString.trim();
		int i1 = myString.indexOf(" ");
		
		System.out.println(i1);
		
		String str1 = "Java";
		String str2[] = {"J","a","v","a"};
		
		String str3 ="";
		
		for(String str : str2)
			str3 = str3 + str;
		
	
		boolean b1 = (str1 == str3);
		boolean b2 = (str1.equals(str3));
		
		System.out.println(b1 + " " + b2);
		*/
		
		/*
		Sudha s = new Sudha();
		s.printAll();
		*/
		
		/*
		int numbers[];
		
		numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 20;
		
		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;
		
		for(int i : numbers)
			System.out.println(" " +i);
		*/
		
		/*
		ArrayList<Integer> points = new ArrayList<>();
		
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		
		System.out.println(points);
		
		points.remove(2);
		
		System.out.println(points);
		
		points.remove(null);
		
		System.out.println(points);
		*/
	}
}