public class ItemTest{
	private final int id;
	
	public ItemTest(int id){
		this.id = id;
	}
	
	public int updateId(int newId){
		//id = newId;
		//return newId;
		return this.id;
	}
	
	public static void main(String[] args){
		ItemTest fa = new ItemTest(42);
		System.out.println(fa.updateId(69));
		
		System.out.println(fa.id);
	}
}