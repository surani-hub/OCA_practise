class TwistInTable{
	public static void main(String[] args){
		String letters = "ABCAB";
		System.out.println(letters.substring(0,2).startsWith("A")); // true
		System.out.println();
		
		String aString = "OCJA"+" Cert"+" Exam";
		System.out.println(aString); // OCJA Cert Exam
		System.out.println();
		
		int num = 10;
		int val = 20;
		String aStr = " OCJA";
		System.out.println(num + val + aStr); // 30 OCJA
		System.out.println((num + val) + aStr); // 30 OCJA
		System.out.println(" " + num + val + aStr); // 1020 OCJA
		System.out.println();
		
		String lang = "JAVA";
		lang += " is everywhere!";
		String initialisedToNull = null;
		initialisedToNull += "Java";
		System.out.println(lang); // JAVA is everywhere!
		System.out.println(initialisedToNull); // nullJava
		System.out.println();
		
		String var1 = new String("Java");
		String var2 = new String("Java");
		System.out.println(var1 == var2); // false
		System.out.println(var1 != var2); // true
		System.out.println(var1.equals(var2)); // true
		System.out.println();
		
		String var3 = "code";
		String var4 = "code";
		System.out.println(var3 == var4); // true
		System.out.println(var3 != var4); // false
		System.out.println(var3.equals(var4)); // true
		System.out.println();	

		String lang1 = "Java";
		String lang2 = "JaScala";
		
		String returnValue1 = lang1.substring(0,1);
		String returnValue2 = lang2.substring(0,1);
		
		System.out.println(returnValue1);
		System.out.println(returnValue2);
		System.out.println(returnValue1 == returnValue2);
		System.out.println(returnValue1.equals(returnValue2));
		
	}
}