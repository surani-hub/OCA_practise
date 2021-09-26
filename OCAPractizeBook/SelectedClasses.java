import java.util.*;

class SelectedClasses{
	
	/*
	public static void secret(ArrayList<String> mystery){
		mystery.add("metal");
		
		String str = mystery.get(0);
		
		int num = mystery.size();
		
		System.out.println(mystery);
		System.out.println(str);
		System.out.println(num);
		
	}
	*/
	
	public static void main(String... dogs){
		
		StringBuilder builder = new StringBuilder("54321");
		
		builder.substring(2);
		System.out.println(builder);
		System.out.println(builder.substring(2));
		
		System.out.println(builder.charAt(1));
		
		builder.append("012345");
		System.out.println(builder);
		builder.substring(5);
		System.out.println(builder.substring(5));
		System.out.println(builder.charAt(1));
		
		/*
		String b = "12";
		b += "13";
		
		// b.reverse();
		System.out.println(b.toString());
		*/
		
		/*
		String teams = new String("694");
		teams.concat(" 1155");
		teams.concat(" 2265");
		teams.concat(" 2869");
		
		System.out.println(teams);
		*/
		
		/*
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		
		System.out.println(chars);
		
		chars.set(1, 'c');
		System.out.println(chars);
		
		chars.remove(0);
		System.out.println(chars);
		
		System.out.println(chars.size() + " " + chars.contains('b'));
		*/
		
		/*
		String line = new String("-");
		String anotherLine = line.concat("-");
		
		System.out.println(line == anotherLine);
		
		System.out.println(line.length());
		
		System.out.println(anotherLine.length());
		
		System.out.println("---------------------------------------");
		*/
		
		/*
		ArrayList<String> names = new ArrayList<String>();
		names.add("ravi");
		names.add("raju");
		names.add("sushant");
		names.add("devva");
		
		secret(names);
		/*
		
		/*
		List<String> museums = new ArrayList<>(1);
		
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Arts");
		
		museums.remove(2);
		
		System.out.println(museums);
		
		StringBuilder b = new StringBuilder("12");
		 b.append("3");
		b.reverse();
		
		System.out.println(b.toString());
		
		StringBuilder z = new StringBuilder("Start");
		// z.append("le");
		
	z.insert(4,"le");
		
		System.out.println(z);
		System.out.println();
		*/
		
		/*
		StringBuilder sb = new StringBuilder("radical");
		
		sb.insert(sb.length(), "robots");
								
		System.out.println(sb);					
		
		
		System.out.println(new StringBuilder().append("clown"));
		System.out.println(new StringBuilder("clown"));
		System.out.println(new StringBuilder("cl").insert(2,"own"));
		
		StringBuilder teams = new StringBuilder("333");
		teams.append(" 806");
		teams.append(" 1601");
		
		System.out.println(teams);
		
		
		List<String> tools = new ArrayList<>(2);
		tools.add("hammer");
		tools.add("nail");
		tools.add("hex key");
		
		System.out.println(tools.get(1));
		
		List<Object> frisbee = new ArrayList<Object>();
		
		//ArrayList sudha = new ();
		*/
		
	}
}