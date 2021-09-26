class ETwo extends DTwo implements CTwo{
	public void aMethod(){}
	public void bMethod(){
		System.out.println("E version of bMethod()");
	}
	public void cMethod(){}
	
	public static void main(String[] args){
		
		DTwo e = (DTwo)(new ETwo());
		e.bMethod(); // D version of bMethod();
		
		/*
		DTwo e = new ETwo();
		e.bMethod(); // E version of bMethod();
		*/
	}
	
}