class Computer{
	public void compute() throws Exception{
		throw new RuntimeException("Error processing request");
	}
	
	public static void main(String[] args)throws Exception {
		try{
			new Computer().compute();
			System.out.println("Ping");
		}catch(NullPointerException npe){
			System.out.println("Pong");
			throw npe;
		}/*catch(Exception e){
			System.out.println("caught");
		}*/
	}
}