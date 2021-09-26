public class Person{
	String name;
	int age; //= 25;
	
	public Person(String n, int a){
		name = n;
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	/*
	public Person(String name){
		this();
		setName(name);
	}
	
	public Person(String name, int age){
		Person(name);
		setAge(age);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String show(){
		return name+" "+ age+ " "+ number;
	}
	*/
	
	/*
	public static void main(String[] args){
		Person p1 = new Person("Jesse");
		Person p2 = new Person("Walter", 52);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
	*/
}