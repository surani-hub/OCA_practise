public class Fortress{
	public void openDrawBridge() throws Exception{
		try{
			throw new Exception("Circle");
		}catch(Exception e){
			System.out.println("Opening!");
		}finally{
			System.out.println("Walls");
		}
	}
	
	public static void main(String[] args){
		new Fortress().openDrawBridge();
	}
}