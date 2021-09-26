class WrapperClassTest{
	public static void main(String[] args){
		
		Short s = 12;
		Integer i = 209;
		
		Boolean bool1 = true;
		Character char1 = 'a';
		Byte byte1 = 20;
		Double double1 = 12.092;
		
		System.out.println(bool1);
		System.out.println(char1);
		System.out.println(byte1);
		System.out.println(double1);
		
		
		System.out.println("---------------------------------");
		System.out.println();
		char c1 = '1';
		
		// Auto boxing using the primitive values
		Boolean bool2 = new Boolean(true);
		Boolean bool3 = new Boolean(false);
		Character char2 = new Character('b');
		Byte byte2 = new Byte((byte)56);
		Double double2 = new Double(34.983);
		
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(char2);
		System.out.println(byte2);
		System.out.println(double2);
		
		System.out.println("---------------------------------------");
		System.out.println();
		
		// Autoboxing with String values
		Boolean bool4 = new Boolean("True");
		Boolean bool5 = new Boolean("falSE");
		Byte byte3 = new Byte("78");
		Double double3 = new Double("290.429");
		
		System.out.println(bool4);
		System.out.println(bool5);
		System.out.println(byte3);
		System.out.println(double3);
		
		System.out.println("-------------------------------------------");
		System.out.println();
		
		//Using static method valueOf()
		Boolean bool6 = Boolean.valueOf(true);
		Boolean bool7 = Boolean.valueOf("TrUe");
		Boolean bool8 = Boolean.valueOf(false);
		Double double4 = Double.valueOf(10);
		
		System.out.println(bool6);
		System.out.println(bool7);
		System.out.println(bool8);
		System.out.println(double4);
		
	}
}