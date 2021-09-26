class StringMethodsTest{
	public static void main(String[] args){
		
		// charAt() method
		String name = new String("Paul");
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(2));
		// System.out.println(name.charAt(4)); // StringIndexOutOfBoundsException
		System.out.println();
		
		// indexOf() method
		String letters = "ABCAB";
		System.out.println(letters.indexOf('B')); // 1
		System.out.println(letters.indexOf("CA")); // 2
		System.out.println(letters.indexOf("S")); // -1
		System.out.println(letters.indexOf("AB", 2)); // 3
		System.out.println();
		
		//substring() method
		String exam = "Oracle";
		System.out.println(exam.substring(2)); // acle
		System.out.println(exam.substring(2, 5)); //acl
		System.out.println();
		
		//trim() method
		String whiteSpaces = "  AB   CB    ";
		System.out.print(":");
		System.out.print(whiteSpaces);
		System.out.print(":"); // :  AB   CB    :
		System.out.println();
		
		System.out.print("--");
		System.out.print(whiteSpaces.trim());
		System.out.print("---");
		System.out.println(); // -- AB   CB---
		
		//replace() method
		String replaceString = "ABABCD";
		System.out.println(replaceString.replace("B", "2")); // A2A2CD
		System.out.println(replaceString.replace('A', '4')); // 4B4BCD
		System.out.println();
		
		System.out.println(replaceString.replace('A','b')); // bBbBCD
		
		// length() method
		String nameLength = "Microsoft";
		System.out.println(nameLength.length());
		System.out.println();
		
		//startsWith() method
		String startingChar = "FACEBOOK";
		System.out.println(startingChar.startsWith("FA")); // true
		System.out.println(startingChar.startsWith("fa")); // false
		// 	System.out.println(startingChar.startsWith('BO', 4));
		System.out.println(startingChar.startsWith("BO", 4)); // true
		System.out.println();
		
		// endsWith() method
		String endChar = "GOOGLE";
		System.out.println(endChar.endsWith("GLE")); // true
		System.out.println(endChar.endsWith("E")); // true
		System.out.println(endChar.endsWith("e")); // false
		//System.out.println(endChar.endsWith("G", 3)); // not complile
		// System.out.println(endChar.endsWith("E", 5)); // not compile
		
		
		String result = "Sunday  ".replace(' ','Z').trim().concat("M n");
		System.out.println(result); // SundayZZM n
		System.out.println();
		
		String day = "SunDday";
		day.replace('D','Z').substring(3);
		System.out.println(day); //SunDday
		day = day.replace('D','Z').substring(3);;
		System.out.println(day); //Zday
		System.out.println();
		
	}
}