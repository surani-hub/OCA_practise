class Caller{
	private void init(){
		System.out.println("initialised");
	}
	
	private void start(){
		init();
		System.out.println("Started");
	}
	
	public static void main(String[] args){
	Caller c = new Caller();
	c.start();
	}
}