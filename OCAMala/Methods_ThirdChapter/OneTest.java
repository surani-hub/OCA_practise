class OneTest{

	/*
	public static void swap(PersonTest p1, PersonTest p2){
		PersonTest temp = p1;
		p1 = p2;
		p2 = temp;
	}
	
	public static void main(String[] args){
		PersonTest person1 = new PersonTest("John");
		PersonTest person2 = new PersonTest("Harry");
		
		System.out.println(person1.getName() + ":" + person2.getName());
		swap(person1, person2);
		System.out.println(person1.getName() + ":" + person2.getName());
		
	}
	*/
	
	public static void resetValueOfNumberVariable(PersonTest p1){
		p1.setName("Rodrigue");
	}
	
	public static void main(String[] args){
		PersonTest person1 = new PersonTest("John");
		System.out.println(person1.getName());
		
		resetValueOfNumberVariable(person1);
		
		System.out.println(person1.getName());
		
	}
	
}



