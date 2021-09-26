import java.util.*;

class Amla{
	public static void main(String[] args){
		List<String> names = new ArrayList<>();
		
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if(names.remove("Bran"))
			names.remove("John");
			
	
		System.out.println(names);
	}
}