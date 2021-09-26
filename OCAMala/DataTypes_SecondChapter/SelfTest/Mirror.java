public class Mirror{
	public static void main(String[] args){
		Boolean buy = new Boolean(true);
		Boolean sell = new Boolean(true);
		
		System.out.println(buy == sell); // false
		
		boolean buyPrim = buy.booleanValue();
		
		System.out.println(!buyPrim); // false
		
		System.out.println(buy && sell); // true
		
	}
}


