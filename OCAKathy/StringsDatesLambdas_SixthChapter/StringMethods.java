class StringMethods{
	public static void main(String[] args){
		String x = "airplane";
		
		System.out.println(x.charAt(2));
		
		String s = "taxi";
		System.out.println(s.concat(" cab"));
		
		String a = "library";
		System.out.println(a + " card");
		
		String b = "Atlantic";
		b += " ocean";
		System.out.println(b);
		
		String d = "Exit";
		System.out.println(d.equalsIgnoreCase("EXIT"));
		System.out.println(d.equalsIgnoreCase("tixe"));
		
		System.out.println(d.length());
		
		String f = "0x0x0x";
		System.out.println(f.replace('x','X'));
		
		String r = "0123456789";
		System.out.println(r.substring(5));
		System.out.println(r.substring(5,8));
		
		String m = "moon";
		System.out.println(m.toLowerCase());
		
		String n = "flower";
		System.out.println(n.toUpperCase());
		
		String q = "big surprise";
		System.out.println(q.toString());
		
		String p = "    hi    ";
		System.out.println(p + "t");
		System.out.println(p.trim() + "t");
	}
}