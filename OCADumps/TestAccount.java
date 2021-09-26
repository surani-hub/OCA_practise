class TestAccount{
	public static void main(String[] args){
		
		CheckingAmount acct = new CheckingAmount((int)(Math.random()*1000));
		
		// acct.amount = 0 ;
		
		//acct.changeAmount(-acct.amount);
		
		// acct.changeAmount(-acct.getAmount());
		acct(0);
		
		System.out.println(acct.getAmount());
	}
}