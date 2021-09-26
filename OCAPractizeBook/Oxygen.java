class Oxygen extends Element{
	public int getSymbol(){
		return 8;
	}
	
	public void printData(){
		try{
			System.out.println(getSymbol());
		}catch(Exception e){
			System.out.println("Unable to read Data");
		}
	}
	
	public static void main(String[] args){
		Oxygen o = new Oxygen();
		o.printData();
	}
}