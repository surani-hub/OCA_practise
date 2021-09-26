class TryFinally{
	public static void main(String[] args){
		System.out.println(new TryFinally().tryAgain());
	}
	
	int tryAgain(){
		int a = 10;
		
		try{
			++a;
		}finally{
			a++;
		}
		
		return a;
	}
}