public class Dumps13{
	
	int a1;
	
	public static int doProduct(int a){
		a = a*a;
		return a;
	}
	
	public static String doString(String s){
		s = s.concat(" "+s);
		return s;
	}
	
	
	
	public static void main(String[] args){
		Dumps13 item = new Dumps13();
		item.a1 = 11;
		
		String sb = "Hello";
		Integer i = 10;
			
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		
		System.out.println(i +" "+sb +" "+item.a1); // 10 hello 11
		
		System.out.println(doProduct(i)); // 100
		System.out.println(doString(sb)); //hello hello
		System.out.println(doProduct(item.a1)); // 121
		
		int[] numbers;
		numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 20;
		
		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;
		
		
		for(int x:numbers){
			System.out.println(" " + x);
		}
		
	}
}