import java.lang.Exception;

class Propagate{
	public static void main(String[] args){
		//Propagate p = new Propagate();
		
		System.out.println(reverse("sudha"));
		System.out.println(reverse(""));
		
	}
	
	static String reverse(String s){
		String reverseString = "";
		try{
			if(s.length() == 0) 
			// throw Exception;
			System.out.println("String can be reversed");
			
			for(int i=s.length()-1;i>=0;--i){
				reverseString += s.charAt(i);
			}
		
		} catch(Exception e){
			System.out.println("String length can not be zero");
		} finally{
			System.out.println("finally got executed");
		}
		return reverseString;
	}
	
	
	
	
}