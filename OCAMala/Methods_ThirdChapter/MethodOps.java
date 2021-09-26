class MethodOps{
	double weight;
	
	void setWeight(double val){
		if(val < -1) return;
		weight = val;
	}

	double getWeight(){
		return weight;
	}
}