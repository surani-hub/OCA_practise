class TestingOne{
	public static int stVar = 100;
	public int var = 200;
	
	public String toString(){
		return var+":"+stVar;
	}
	
	public static void main(String[] args){
		TestingOne t1 = new TestingOne();
		t1.var = 300;
		System.out.println(t1);
		
		TestingOne t2 = new TestingOne();
		t2.stVar = 300;
		System.out.println(t2);
	}
}