class RetrivePrimitives{
	public static void main(String[] args){
		
		Boolean bool1 = true;
		boolean b1 = bool1.booleanValue();
		
		System.out.println(b1);
		System.out.println(bool1.booleanValue());
		System.out.println();
		
		Character char1 = 'a';
		Integer int1 = 289;
		Double double1 = 209.987;
		
		System.out.println(char1.charValue());
		System.out.println(int1.intValue());
		System.out.println(double1.doubleValue());
		System.out.println();
		
		long long2 = Long.parseLong("1234");
		byte byte2 = Byte.parseByte("12");
		boolean bool2 = Boolean.parseBoolean("true");
		boolean bool3 = Boolean.parseBoolean("TrUe");
		
		System.out.println(long2);
		System.out.println(byte2);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println();
		
		Long var1 = Long.valueOf(123);
		Long var2 = Long.valueOf("123");
		System.out.println(var1 == var2); // true
		
		Long var3 = Long.valueOf(223);
		Long var4 = Long.valueOf(223);
		System.out.println(var3 == var4); // false
		
		Double var5 = Double.valueOf(123.45);
		Double var6 = Double.valueOf(123.45);
		System.out.println(var5 == var6); // false;
		
	}
}