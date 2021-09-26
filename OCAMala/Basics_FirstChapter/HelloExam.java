class HelloExam{
	public static void main(String[] args){
		System.out.println("Hello Exam");
		main(20);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
	
	public static void main(int number){
		System.out.println("integer numbers");
		main("Sudha");
	}
	
	public static void main(String args){
		System.out.println("String arguments");
	}
}