public class TestBOne //extends TestAOne
{
	
	/*
	public void start(){
		System.out.println("TestBOne");
	}
	*/
	
	public static void main(String[] args){
//		((TestAOne)new TestBOne()).start();
		
		System.out.println(new TestAOne(){
			public String toString(){ return "test";}
		});
	}
}