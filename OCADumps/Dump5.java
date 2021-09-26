public class Dump5{
	
	static Integer i=0;
	
	public static void main(String[] args){
		try{
			System.out.println(i.compareTo(0));
		}catch(ArithmeticException | NullPointerException e){
			System.out.println("Exception");
		}
	}
}