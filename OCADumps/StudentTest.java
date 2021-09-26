class StudentTest{
	public static void main(String[] args){
		
		
		Student[] students = new Student[3];
		
		students[1] = new Student("Richard");
		students[2] = new Student("Donald");		
		
		for(Student s: students)
			System.out.println(""+s.name);
	
	/*	
		int x = 1;
		int y = 0;
		
		if(x++ > ++y){
			System.out.println("Hello");
		} else {
			System.out.println("Welcome");
		}
		
		System.out.println("Log "+ x+" "+ y);
		
		String arg1 = args[1];
		String arg2 = args[2];
		String arg3 = args[3];
		
		System.out.println("Arg is "+ arg3);
		
		int[] arr = {1,2,3,4};
		int i = 0;
		
		do{
			System.out.println(arr[i] + " ");
			i++;
		}while(i < arr.length-1);
		
		System.out.println("----------------------------------------------------------");
		
		*/
		
	}
}