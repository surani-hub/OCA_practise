public class SubCalc extends SuperCalc{
	
	public static int multiply(int a, int b){
		int c = SuperCalc.multiply(a,b);
		return c;
	}
	
	
	public static void main(String[] args){
		SubCalc sc = new SubCalc();
		
		System.out.println(sc.multiply(3,4));
		System.out.println(SubCalc.multiply(2,2));
		
	}
}