class EJava{
	public static void main(String[] args){
	EJava e = new EJava();
	e.method();
	}
	
	void method(){
		try{
			guru();
			return;
		}finally{
			System.out.println("finally");
		}
	}
	
	void guru(){
		System.out.println("guru");
		throw new StackOverflowError();
	}
}