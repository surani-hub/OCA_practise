public class WhackAnException{
	public static void main(String[] args){
		try{
			throw new ClassCastException();
		}catch(IllegalArgumentException e){
			throw new IllegalArgumentException();
		}catch(RuntimeException e){
			throw new NullPointerException();
		}finally{
			throw new RuntimeException();
		}
	}
}