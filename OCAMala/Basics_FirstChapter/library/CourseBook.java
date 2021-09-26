package library;

class CourseBook extends Book{
	public CourseBook(){
		author = "ABC";
		modifyTemplate();
	}
	
	public static void main(String[] args){
		CourseBook course = new CourseBook();
	}
}