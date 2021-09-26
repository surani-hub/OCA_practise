// Checking Instance variable and local variable scope
class TestServer{
	int count = 10;
	
	public void logIn(){
	int count = 9;
		System.out.println("local variable count is " + count);
	}
	
	public void count(){
		System.out.println("instance variable count is "+ count);
	}
	
	public static void main(String[] args){
		TestServer ts = new TestServer();
		ts.logIn();
		ts.count();
	}
}