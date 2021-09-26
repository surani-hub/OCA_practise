class ImplicitCasting{
	public static void main(String[] args){
		byte b = 3;
		// b += 7;
		
		b = (byte)(b+7);
		
		System.out.println(b);
	}
}