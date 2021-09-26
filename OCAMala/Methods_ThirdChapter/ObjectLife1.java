class ObjectLife1{
	public static void main(String[] args){
		/* 
		Exam myExam = new Exam();
		myExam.setName("OCA Java Programme 1");
		System.out.println(myExam.getName());
		
		myExam = null;
		// System.out.println(myExam.getName()); - NullPointerException
		
		myExam = new Exam();
		myExam.setName("PHP");
		System.out.println(myExam.getName());
		
		// System.out.println(myExam);
		*/
		Exam exam = new Exam("PHP");
		System.out.println(exam);
		
		exam = null;
		
		exam = new Exam("SQL");
		System.out.println(exam);
		
		exam = new Exam("Java");
		System.out.println(exam);
		
		Exam yourExam = new Exam("PMP");
		System.out.println(yourExam);
		
		yourExam = exam;
		System.out.println(yourExam);
		
		
		
	}
}