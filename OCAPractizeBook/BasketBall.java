public class BasketBall{
	public static void main(String[] args){
		try{
			System.out.println(1);
			throw new ClassCastException();
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(2);
		}catch(Throwable t){
			System.out.println(3);
		}finally{
			System.out.println(4);
		}
		
		System.out.println(5);
	}
}