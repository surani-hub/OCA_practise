class TestA{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		System.out.println(a1.getInstanceCount());
		System.out.println(a2.getInstanceCount());
		System.out.println(a3.getInstanceCount());
		
	}
}