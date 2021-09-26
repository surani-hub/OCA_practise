class PhoneOne{
	String model;
	String company;
	private double weight;
	
	public void setWeight(double val){
		if(val >=0 && val <= 1000){
			weight = val;
		}
	}
	
	public double getWeight(){
			return weight;
	}
	
	void makeCall(String number){
	
	}
	
	void receiveCall(){
	
	}
	
}