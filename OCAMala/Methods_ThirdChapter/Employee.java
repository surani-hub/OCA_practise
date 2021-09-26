class Employee{
	
	private String name;
	int age;
	
	/*
	Employee(){
		age = 22;
	}	
	*/
	
	public void setName(String val){
		name = val;
	}
	
	/*
	public void printEmp(){
		System.out.println("name = " + name + " age = " + age);
	}
	*/
	
	public int daysOffWork(int... days){
		int dayOff = 0;
		
		for(int i = 0; i < days.length; i++){
			dayOff += days[i];
		}		
		return dayOff;	
	}
	
	
	/*
	Employee(){
		// Employee(26, "Sudha");
		this("Sudha", 26);
		name = "John";
		age = 25;
	}

	Employee(String newName){
		name = newName;
		age = 25;
	}
	
	Employee(int newAge, String newName){
		age = newAge;
		name = newName;
	}
	
	Employee(String newName, int newAge){
		age = newAge;
		name = newName;
	}
	*/
	
	/*
	Employee(){
		age = 20;
		System.out.println("Constructor");
	}
	
	Employee(int newAge, String newName){
		name = newName;
		age = newAge;
	}
	*/
	
	/*
	public String toString(){
		return name + age;
	}
	
	void Employee(){
		System.out.println("not a constructor");
	}
	
	{
		System.out.println("Employee:initializer1");
	}
	
	Employee(){
		age = 20;
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Employee:initializer2");
	}
	*/
	
}