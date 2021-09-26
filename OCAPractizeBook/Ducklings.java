public class Ducklings extends Duck{
	private int age;
	
	public Ducklings(int age){
		this.age = age;
		}
		
	public int getDuckies(){
		return this.age/count;
	}
	
	public static void main(String[] args){
		Duck itQuacks = new Ducklings(5);
		
		System.out.println(itQuacks.getDuckies());
	}
}