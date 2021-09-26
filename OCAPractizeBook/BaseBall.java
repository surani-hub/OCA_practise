class BaseBall{
	public static void main(String[] args){
		int score = 1;
		
		try{
			System.out.println(score++);
			// System.out.println(1);			//1
		}catch(Throwable t){
			System.out.println(score++);
		}finally{
			System.out.println(score++);//2
		}
		
		System.out.println(score++);//3
	}
}