class COne extends AOne{
	public void test(){
		System.out.println("C");
	}
	
	public static void main(String[] args){
		AOne b1 = new AOne();
		AOne b2 = new COne();
		
		b1 = (AOne) b2;
		
		// A b3 = (BOne) b2;
		// A b3 = (BOne) b2;
		
		b1.test();
		 // b3.test();
		 b2.test();
		 
		 System.out.println("Result A " + 0 + 1);
		 System.out.println("Result B " + (0) + (1));
		
	}
}