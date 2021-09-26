public class FootBallOne{
	public static void main(String[] args){
		try{
			System.out.println('A');
			throw new RuntimeException("Out of bounds");
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println('B');
			throw aioobe;
		}finally{
			System.out.println('C');
		}
	}
}