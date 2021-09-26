class RelationalOpTest{
	public static void main(String[] args){
		int i1 = 10;
		int i2 = 20;
		System.out.println(i1 >= i2); // false
		System.out.println(i1 == i2); // false
		System.out.println(i1 != i2); // true
		
		
		long long1 = 10;
		long long2 = 20;
		System.out.println(long1 <= long2); // true
		
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		
		boolean b1 = false;
		System.out.println(b1 == true); // false
		System.out.println(b1 != true); // true
		System.out.println(b1 == false); // true
		System.out.println(b1 != false); // false
		
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		
		int a = 10;
		boolean b2 = false;
		int b = 20;
		//System.out.println(a == b2);
		System.out.println(a = 20); // 20
		System.out.println(b2 = true); // true
		System.out.println(b2 = false); // false
		
		System.out.println("------------------------------------------------------------");
		System.out.println();
		
		
		System.out.println(a>20 && b>=10); //false
		System.out.println(a>20 || b>=10); // true
		System.out.println(!(b>10)); // false
		System.out.println(!(a>20)); // true
		
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		
		int marks = 8;
		int total = 10;
		System.out.println(total<marks && ++marks>5); // false
		System.out.println(marks); // 8
		System.out.println(total==10 || ++marks>10); // true
		System.out.println(marks); // 8
		
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		
		String name = "hello";
		if(name != null && name.length()>0)
			System.out.println(name.toUpperCase());
		
		System.out.println("------------------------------------");
		System.out.println();
		
		int int1=10, int2=20, int3=30;
		System.out.println(int1 % int2 * int3 + int1 / int2); // 300
		
		System.out.println(int1 % int2 * (int3 + int1) / int2); // 20
				
	}
}