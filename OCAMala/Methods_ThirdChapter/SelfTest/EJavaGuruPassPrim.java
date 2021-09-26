class EJavaGuruPassPrim{
	public static void main(String[] args){
		int ejg = 10;
		anotherMethod(ejg);
		System.out.println(ejg);
		
		someMethod(ejg);
		System.out.println(ejg);
	}
	
	static void someMethod(int val){
		++val;
		System.out.println(val);
	}
	
	static void anotherMethod(int val){
		val = 20;
		System.out.println(val);
	}
}