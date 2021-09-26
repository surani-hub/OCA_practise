class PolymorphismWithInterfaces{
	public static void main(String[] args){
		Employee expert1 = new Programmer();
		Employee expert2 = new Manager();
		Employee expert3 = new Employee();
		
		expert1.deliverMobileApp(); // testing complete on real device
		expert2.deliverMobileApp(); // QA complete
		expert3.deliverMobileApp();							// code delivered with release notes
	}
}