class EJava{
	public EJava(){
		this(7);
		System.out.println("public");
	}
	
	private EJava(int val){
		this("Sunday");
		System.out.println("private");
	}
	
	protected EJava(String val){
		System.out.println("protected");
	}
}