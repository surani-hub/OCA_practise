class Test{
	public static void main(String[] args){
		MyInterface[] interfaceArray = new MyInterface[]{
															new MyClass1(),
															null,
															new MyClass2()
															};
															
		Vehicle[] verhicleArray = new Vehicle[]{
													new Car(),
													new Bus(),
													null
													};
													
		Object[] objArray = new Object[]{
											new MyClass1(),
											new MyClass2(),
											null,
											new Car(),
											new Bus(),
											new java.util.Date(),
											new String("tech contest"),
											new Integer[7]
											};
	}
}