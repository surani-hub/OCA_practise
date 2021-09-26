public class A{
	private int counter =0;
	
	public int getInstanceCount(){
		return counter;
	}
	
	public A(){
		counter++;
	}
	
}