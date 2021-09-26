public class InitOrder{
	public String first = "instance";
	
	public InitOrder(){
		first = "Constructor";
	}
	
	{
		first = "block";
	}
	
	public void print(){
		System.out.println(first);
	}
	
	public static void main(String[] args){
		new InitOrder().print();
	}
}