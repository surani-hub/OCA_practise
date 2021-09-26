class DontBoilFrogs implements FrogBoilable{
	public static void main(String[] args){
		new DontBoilFrogs().go();
	}
	
	void go(){
		System.out.println(hop());
		// System.out.println(getCtoF(100)); // compiler error
		System.out.println(FrogBoilable.getCtoF(100));
		
		DontBoilFrogs dfb = new DontBoilFrogs();
		
		// System.out.println(dfb.getCtoF());
		System.out.println(dfb.hop());
		
		
	}
}