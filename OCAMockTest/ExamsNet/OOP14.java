public class OOP14{
	public static void main(String[] args){
		
		test(null);
	}
	
	public static void test(String str){
		if(str==null || str.length() ==0)
		{
			System.out.println("String is empty");
		} else{
			System.out.println("String not is empty");
		}
	}
}