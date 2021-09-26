class TestFrog{
	public static void main(String[] args){
		new FrogOne();
		new FrogOne();
		new FrogOne();
		System.out.println("from static "+ FrogOne.getCount());
		
		new FrogOne();
		TestFrog t = new TestFrog();
		t.go();
		
		FrogOne f = new FrogOne();
		System.out.println("use reference variable "+ f.getCount());
	}
	
	public void go(){
		System.out.println("from instance "+ FrogOne.getCount());
	}
}