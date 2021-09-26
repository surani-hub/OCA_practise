class AssignmentOps{
	public static void main(String[] args){
		int sizeOfYard = 10;
		int numOfPets = 5;
		
		String status = (numOfPets < 4) ? "Pet count OK" : (sizeOfYard > 8) ? "Pet limit on edge" : "too many pets";
		
		System.out.println("Pet status is " + status);
		
	}
}