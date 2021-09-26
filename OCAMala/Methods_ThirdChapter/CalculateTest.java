class CalculateTest{
	public static void main(String[] args){
		CalculateTest ct = new CalculateTest();
		double result = ct.calcAverage(40, 60);
		System.out.println(result);
		
		printHello();
		System.out.println();
		
		int workingDays = ct.dayOffWork(30);
		System.out.println(workingDays);
		
	}
	
	
	double calcAverage(int marks1, int marks2){
		double avg = 0;
		avg = (marks1+marks2)/2.0;
		return avg;
	}
	
	static void printHello(){
		System.out.println("Printing Hello to World!");
	}
	
	public int dayOffWork(int... days){
		int daysOff = 0;
		
		for(int i=0;i<days.length;i++){
			daysOff += days[i];
		}
		return daysOff;
	}
}