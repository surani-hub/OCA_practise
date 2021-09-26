import java.io.FileInputStream;

public class ArrayAccess{
	public static void main(String[] args){
		
		String[] students = {"Shreya", "Sharan",null};
		
		try{
			System.out.println(students[5]);
			}catch(ArrayIndexOutOfBoundsException e){
					System.out.println("Exception");
			}
		
		System.out.println("all seem to be well");
		
		int pos = 1;
		if(pos > 0 && pos < students.length)
			System.out.println(students[pos]);
		
		//FileInputStream fis = new FileInputStream("file.txt");
		
		//myMethod();
	}
	
	/*
	public static void myMethod(){
		System.out.println("myMethod");
		myMethod();
	}
	*/
	
}