class StringTesting{
	public static void main(String[] args){
		String s = "abcdef";
		String s2 = s;
		
		s = s.concat(" more stuff");
		
		System.out.println(s + " " + s2);
		
		
		String x = "Java";
		x = x.concat("Rules!");
		System.out.println("x = " + x);
		
		x = x.toLowerCase();
		System.out.println("x = " + x);
		
		
		
	}
}