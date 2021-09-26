class Surgeon extends Doctor{
	Surgeon(String val){
		specialization = val;
	}
	
	String specialization;
	
	String getSpecialization(){
		return specialization;
	}
}