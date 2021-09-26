public class TestDemo{
	
	public void readCard(int cardNo) throws Exception{
		System.out.println("Reading card");
	}
	
	public void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Checking card");
	}
	
	public static void main(String[] args){
		TestDemo ex = new TestDemo();
			int cardNo = 12345;
		
		ex.readCard(cardNo);
		
		ex.checkCard(cardNo);
	
	}	
}