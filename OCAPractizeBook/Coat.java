public class Coat{
	public Long zipper() throws Exception{
		try{
			String checkZipper = (String)new Object();
		}catch(Exception e){
			throw new RuntimeException("Broken!");
		}
		return null;
	}
	
	public static void main(String[] args){
		try{
			new Coat().zipper();
			System.out.println("Finished!");
		}catch(Throwable t){
		
		}
	}
}