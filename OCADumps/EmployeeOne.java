public class EmployeeOne{
	private String name;
	private int age;
	private int salary;
	
	public EmployeeOne(String name, int age){
		this.name = name;
		this.age = age;
		setSalary(2000);
	}
	
	public EmployeeOne(String name, int age, int salary){
		this(name, age);
		this.salary = salary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public void printDetails(){
		System.out.println(name +" " + age +" " + salary);
	}
}