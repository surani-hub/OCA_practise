class CompareObj{
	public static void main(String[] args){
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		Integer i3 = Integer.valueOf(10);
		Integer i4 =  Integer.valueOf(10);
		
		Integer i5 = 10;
		Integer i6 = 10;
		
		System.out.println(i1 == i2); // false
		System.out.println(i3 == i4); // true
		System.out.println(i4 == i5); // true
		System.out.println(i5 == i6); // true
		System.out.println();
		
		System.out.println(i1.equals(i2)); //true
		System.out.println(i3.equals(i4)); // true
		System.out.println(i4.equals(i5)); // true
		System.out.println(i5.equals(i6)); // true
		System.out.println();
		

		Integer i7 = new Integer(223);
		Integer i8 = new Integer(223);
		
		Integer i9 = Integer.valueOf(223);
		Integer i10 =  Integer.valueOf(223);
		
		Integer i11 = 223;
		Integer i12 = 223;
		
		System.out.println(i7 == i8); // false
		System.out.println(i9 == i10); // false
		System.out.println(i10 == i11); // false
		System.out.println(i11 == i12); // false
		System.out.println();
		
		System.out.println(i7.equals(i8)); // true
		System.out.println(i9.equals(i10)); // true 
		System.out.println(i10.equals(i11)); // true
		System.out.println(i11.equals(i12)); // true
		System.out.println();
		
		Integer obj1 = 100;
		Short obj2 = 100;
		
		System.out.println(obj1.equals(obj2)); // false
		// System.out.println(obj1 == obj2); // do not complie
		System.out.println(obj1.compareTo(100)); // true means 0
		System.out.println(obj1.compareTo(120)); // false means -1
		System.out.println();
		
		
	}
}