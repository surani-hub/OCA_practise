class MultiInt implements I1, I2{
	public static void main(String[] args){
		new MultiInt().go();
	}
	
	void go(){
		System.out.println(doStuff());
	}
	
	int doStuff(){
		return 3;
	}
}