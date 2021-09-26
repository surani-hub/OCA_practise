class RiverRafting{
	void crossRapid(int degree) throws FallInRiverException{
		System.out.println("Cross rapid");
		if(degree > 10)
			throw new FallInRiverException();
	}
	
	void rowRaft(String state) throws DropOarException{
		System.out.println("Row raft");
		if(state.equals("nervous"))
			throw new DropOarException();
	}
}