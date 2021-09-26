class OverloadedMethods{
	public static void main(String[] args){
		
		int intVal = 10;
		System.out.println(intVal);
		
		boolean booleanVal = false;
		System.out.println(booleanVal);
		
		String stringVal = "eJava";
		System.out.println(stringVal);
		
		System.out.println();
	
		OverloadedMethods om = new OverloadedMethods();
		
		double avg1 = om.calcAverage(20, 34.5);
		double avg2 = om.calcAverage(10, 20, 30);
		double avg3 = om.calcAverage('a', 'b');
		double avg4 = om.calcAverage(20, 34);
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
		
	}
	
	double calcAverage(int marks1, double marks2){
		return (marks1 + marks2)/2.0;
	}
	
	double calcAverage(double marks1, int marks2){
		return (marks1 + marks2)/2.0;
	}
	
	
	double calcAverage(int marks1, int marks2, int marks3){
		return (marks1 + marks2 + marks3)/3.0;
	}
	
	double calcAverage(char marks1, char marks2){
		return (marks1 + marks2)/2.0;	
	}
	
	/*
	double calcAverage(int[] marks){
		return ;
	}
	
	double calcAverage(int... marks){
		
	}
	*/
	
}