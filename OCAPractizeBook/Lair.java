public class Lair{
	public void openDrawBridge() throws Exception{
		try{
			throw new Exception("This exception");
		}catch(RuntimeException e){
			throw new DragonException();
		}finally{
			throw new RuntimeException("Or maybe this one");
		}
	}
	
	public static void main(String[] args) throws Exception{
		new Lair().openDrawBridge();
	}
}