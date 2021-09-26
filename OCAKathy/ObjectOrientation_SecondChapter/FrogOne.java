class FrogOne{
	private static int frogCount = 0;
	
	static int getCount(){
		return frogCount;
	}
	
	public FrogOne(){
		frogCount += 1;
	}
}