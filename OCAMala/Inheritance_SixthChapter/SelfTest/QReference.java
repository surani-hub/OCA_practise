class QReference{
	public static void main(String[] args){
		
		Base base = new Base();
		Base derived = new Derived();
		
		System.out.println(base.name);
		System.out.println(derived.name);
		
		base.printName();
		derived.printName(); 
		
	}
}









