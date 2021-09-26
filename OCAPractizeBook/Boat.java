class Boat extends Transport{
	public int travel() throws CapsizedException{
		return 4;
	}
	
	public static void main(String[] args) throws Exception{
		try{
			System.out.println(new Boat().travel());
		}catch(Exception e){
			System.out.println(8);
		}
	}
}