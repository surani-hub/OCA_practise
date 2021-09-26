class BankAccount{
	String accountNumber;
	int accType;
	
	/*
	public boolean equals(Object obj){
		if(obj instanceof BankAccount){
			BankAccount b = (BankAccount)obj;
			boolean isEqual = accountNumber.equals(b.accountNumber) && accType == b.accType;
			return isEqual;
		} else {
			return false;
		}
	}
	*/
	
	public boolean equals(Object obj){
		return true;
	}
	
}