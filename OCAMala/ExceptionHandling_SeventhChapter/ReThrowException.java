import java.io.*;

class ReThrowException{
	FileInputStream fis = null;
	
	public static void main(String[] args) //throws FileNotFoundException
	{
		ReThrowException re = new ReThrowException();
		
		try{
			re.methods();
		}catch(FileNotFoundException e){
			System.out.println("Caught");
		}
		
	}
	
	public void methods() throws FileNotFoundException
	{
		try{
			fis = new FileInputStream("soccer.txt");
		}catch(FileNotFoundException fnfe){
			System.out.println("File not found");
			throw fnfe;
			}
		}
	}
 