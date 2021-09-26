public class Palace{
	public void openDrawBridge() throws Exception{
		try{
			throw new Exception("Problem");
		}catch(OpenDoorException e){
			throw new OpenDoorException();
		}catch(CableSnapException ex){
			try{
				throw new OpenDoorException();
			}catch(Exception e){
				
			}finally{
				throw new RuntimeException("Unending problem");
			}
		}
	}
	
	public static void main(String[] args) throws IllegalArgumentException{
		new Palace().openDrawBridge();
	}
}