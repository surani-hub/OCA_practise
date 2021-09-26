class EJava{
	public static void main(String[] args){
		Person person = new Person();
		
		Moveable move = (x) -> Person.MIN_DISTANCE + x;
		
		System.out.println(person.name + person.height + person.result + person.age + move.move(20));
	}
}