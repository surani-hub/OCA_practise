class StringBuilderTest{
	public static void main(String[] args){
	
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder(sb1);
	StringBuilder sb3 = new StringBuilder(50);
	StringBuilder sb4 = new StringBuilder("Sudha Maali");
	
	//append() method
	sb1.append(true);
	sb1.append(10);
	sb1.append('a');
	sb1.append(20.99);
	sb1.append("Hi");
	
	System.out.println(sb1); // true10a20.99Hi
	System.out.println(); 
	
	StringBuilder sb5 = new StringBuilder();
	char[] name = {'J','a','v','a','8'};
	sb5.append(name, 1,3);
	System.out.println(sb5); // ava 
	System.out.println(); 
	
	StringBuilder str = new StringBuilder();
	str.append("Oracle");
	str.append(new StringBuilder(" Certification"));
	System.out.println(str); // Oracle Certification 
	str.append(new Person("Associate"));
	System.out.println(str); 
	System.out.println(); 
	
	
	//insert() method
	StringBuilder sb = new StringBuilder("Bon");
	sb.insert(2,'r');
	System.out.println(sb); // Born
	System.out.println(); 
	
	StringBuilder st = new StringBuilder("123");
	char[] name1 = {'J','a','v','a','9'};
	st.insert(1,name1,1,3); 
	System.out.println(st); // 1ava23
	System.out.println(); 
	
	//delete() & deleteCharAt() methods
	StringBuilder sr = new StringBuilder("012345");
	sr.delete(2,4);
	System.out.println(sr); // 0145
	sr.deleteCharAt(1);
	System.out.println(sr); // 045
	System.out.println(); 
	
	//reverse() method
	sr.reverse();
	System.out.println(sr); //540
	System.out.println(); 
	
	//replace() method
	StringBuilder srt = new StringBuilder("0123456");
	srt.replace(2,4,"ABCD");
	System.out.println(srt); // 01ABCD456
	System.out.println(); 
	
	String replaceString = new String("ABCD");
	String newString = replaceString.replace("BC","AD");
	String newString1 = replaceString.replace("B","AD");
	System.out.println(newString); // AADD 
	System.out.println(newString1); // AADCD 
	System.out.println(); 
	
	
	//subSequence() method
	StringBuilder sbr = new StringBuilder("012345");
	System.out.println(sbr.subSequence(2,4)); // 23
	System.out.println(sbr);  // 012345
	

	}
}