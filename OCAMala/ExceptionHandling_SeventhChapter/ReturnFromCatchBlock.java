import java.io.*;

class ReturnFromCatchBlock{
	public static void main(String[] args){
		openFile();
	}
	
	public static void openFile(){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("abc.txt");
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}finally{
			System.out.println("finally");
		}
		
		System.out.println("Next task...");
	}
}