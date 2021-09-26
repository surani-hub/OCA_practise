class Person{
	Person(String s, int i){
		++pid;
		name = s;
		age = i;
	}
	
	String name;
	int age;
	static int pid;
	
}