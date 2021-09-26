// import java.io.FileInputStream;
import java.io.*;

class MultipleExceptions{
	public static void main(String[] args){
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("file.txt");
			System.out.println("File opened");
			fis.read();
			System.out.println("File read");
		} catch(FileNotFoundException fnfe){
			System.out.println("File not found");
		} catch(IOException ioe){
			System.out.println("I/O exception");
		}finally{
			System.out.println("finally");
		}
		
		System.out.println("Next task...");
	}
}