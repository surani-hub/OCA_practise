class derivedB extends derivedA{
	public void test(){
		System.out.println("derivedB");
	}
	
	public static void main(String[] args){
		Base b1 = new derivedB();
		Base b2 = new derivedA();
		Base b3 = new derivedB();
		
		b1 = (Base) b3;
		
		Base b4 = (derivedA) b3;
		
		b1.test();
		b4.test();
		
	}
}