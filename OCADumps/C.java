class C extends B{
	/*
	public C(){
		System.out.println("C");
	}
	*/
	
	public void test(){
		System.out.println("C");
	}
	
	public static void main(String[] args){
		//C c = new C();
		A b1 = new A();
		A b2 = new C();
		
		A b3 = (B)b2;
		b1 = (A)b2;
		
		
	//	A b3 = (B)b2;
		
		b1.test();
		b2.test();
		b3.test();
		
	}
}