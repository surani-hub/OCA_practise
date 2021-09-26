class ScopeTest{
	public static void main(String[] args){
		ScopeTest st = new ScopeTest();
		st.myMethod();
	}
	
	public void myMethod(){
		int result = 88;
		
		if(result < 78){
			Exam myExam = new Exam();
			myExam.setName("Android");
			System.out.println(myExam.getName());
		} else {
			Exam myExam2 = new Exam();
			myExam2.setName("MySQL");
			System.out.println(myExam2.getName());
		}
	}
}