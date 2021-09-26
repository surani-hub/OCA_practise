class PolymorphismWithClasses{
	public static void main(String[] args){
		Employee emp1 = new Programmer();
		Employee emp2 = new Manager();
		Employee emp3 = new Employee();
		
		emp1.startProjectWork(); // define classes
		emp2.startProjectWork(); // unit test code
								// meet customer
								// project schedule
								// start team work
		 
		emp1.reachOffice(); // Reached office - Gurgaon, India
		emp2.reachOffice(); // Reached office - Gurgaon, India
		emp3.startProjectWork(); // procure hardware
							// install software
	}
}