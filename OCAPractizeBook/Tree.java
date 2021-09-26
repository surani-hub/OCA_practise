public class Tree implements Plant, Living{
	public String grow(int height){
		return "super growing!";
	}
	
	public String grow(){
			return "tree growing!";
	}
	
	public static void main(String[] args){
		Plant p = new Tree();
		
		System.out.println(((Living)p).grow());
		
		String name = "";
		int _number = 694;
		boolean profit$$$;
		
		System.out.println(name+" won."+ _number+" profit? "+ profit$$$);
	}
}