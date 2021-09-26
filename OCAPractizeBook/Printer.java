import java.io.*;

class Printer{
	
	public void print(){
		try{
			throw new FileNotFoundException();
		}catch(IOException exception){
			System.out.println("Z");
		}catch(FileNotFoundException enfe){
			System.out.println("X");
		}finally{
			System.out.println("Y");
		}
	}
	
	public static void main(String[] args){
		new Printer().print();
	}
}