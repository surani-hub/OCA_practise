public class Street{
	public static void main(String[] args) throws RuntimeException{
		dancing();
	}
	
	public static void dancing() throws RuntimeException{
		try{
			throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			System.out.println("double");
		}
	}
}