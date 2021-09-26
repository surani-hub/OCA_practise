public class Sleep{

	public static void snore() throws Exception{
	try{
		String sheep[] = new String[3];
		System.out.println(sheep[3]);
	}catch(RuntimeException re){
		System.out.println("Awake!");
	}finally{
		throw new Exception();
	}
}
	
	public static void main(String[] args) throws Exception{
		new Sleep().snore();
	}
}