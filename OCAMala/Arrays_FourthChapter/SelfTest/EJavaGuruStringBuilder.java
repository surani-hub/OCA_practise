class EJavaGuruStringBuilder{
	public static void main(String[] args){
		
		StringBuilder sb1 = new StringBuilder(10+2+"SUN"+4+5);
		sb1.append(sb1.delete(3,6));
		
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("123456");
		sb2.subSequence(2,4);
		sb2.deleteCharAt(3);
		sb2.reverse();
		
		System.out.println(sb2);
	}
}