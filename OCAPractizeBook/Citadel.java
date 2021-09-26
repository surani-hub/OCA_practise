public class Citadel{
	
	public void openDrawBridge() throws RuntimeException, Exception{
		try{
			throw new KnightAttackingException();
		}catch(Exception e){
			throw new ClassCastException();
		}finally{
			throw new CastleUnderSiegeException();
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		new Citadel().openDrawBridge();
	}
}