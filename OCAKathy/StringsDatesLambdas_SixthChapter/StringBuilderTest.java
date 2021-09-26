class StringBuilderTest{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		
		System.out.println("sb = " + sb);
		
		sb.append("ghi").reverse().insert(2,"---");
		System.out.println("sb = " + sb);
		
		
		StringBuilder s1 = new StringBuilder("0123456789");
		s1.delete(4,6);
		System.out.println(s1);
		
	}
}