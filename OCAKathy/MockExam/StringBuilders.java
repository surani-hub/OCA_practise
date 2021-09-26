class StringBuilders{
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder("eLion");
		String epg = null;
		
		epg = sb1.append("X").substring(sb1.indexOf("L"), sb1.indexOf("X"));
		
		System.out.println(epg);
	}
}