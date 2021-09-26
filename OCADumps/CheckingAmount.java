class CheckingAmount{
	public int amount;
	
	public CheckingAmount(int amount){
		this.amount = amount;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void changeAmount(int x){
		amount += x;
	}
}