public class PersonOne{
	String name;
	int age = 25;
	
	public PersonOne(String name){
		//this();
		setName(name);
	}
	
	public PersonOne(String name, int age){
		this(name);
		setAge(age);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String show(){
		return name +" " + age;
	}
	
	public static void main(String[] args){
			PersonOne p1 = new PersonOne("Jesse");
			PersonOne p2 = new PersonOne("Walter", 52);
			
			System.out.println(p1.show());
			System.out.println(p2.show());
		
	}
}