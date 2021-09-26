import java.util.*;

class Happy{
	public static void main(String[] args){
		
		List<String> magazines = new ArrayList<>();
		
		magazines.add("Readers digest");
		magazines.add("people");
		System.out.println(magazines); // Readers digest, people
		magazines.clear(); //
		
		magazines.add("The economist");
		//magazines.remove(0);
		
		System.out.println(magazines.size());
		
		String witch = "b";
		String tail = "lack";
		
		witch = witch.concat(tail);
		
		System.out.println(witch);
		
		/*
		String happy = " :) - (: ";
		String really = happy.trim();
		
		String question = happy.substring(1, happy.length()-1);
		
		System.out.println(really.equals(question));
		
		StringBuilder builder = new StringBuilder("54321");
		builder.substring(2);
		
		System.out.println(builder);
		
		System.out.println(builder.charAt(1));
		
		List<Integer> pennies = new ArrayList<>();
		pennies.add(3);
		pennies.add(2);
		pennies.add(1);
		
		pennies.remove(2);
		
		System.out.println(pennies);
		*/
		
	}
}