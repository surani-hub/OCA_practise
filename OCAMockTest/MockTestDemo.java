class MockTestDemo{
	int a = 10;
	
	public static void main(String[] args){
		int[][] a = new int[3][];
		
		a[1] = new int[]{1,2,3};
		a[2] = new int[]{4,5};
		
		System.out.println(a[1][1]);
		
		new MockTestDemo().print();
		
		System.out.println("Instance variable value is " + new MockTestDemo().a);
		
	}
	
	public void print(){
		int a = 8;
		System.out.println("a is " + a);
		
	}
}