import java.io.IOException;
import java.io.FileNotFoundException;

public class Backup{
	public void performBackup(){
		try{
			throw new IOException("Disk not found!");
		}catch(Exception e){
			try{
				throw new FileNotFoundException("File not found");
			}catch(FileNotFoundException fne){
				System.out.println("Failed");
			}
		}
	}
	
	public static void main(String[] args){
		new Backup().performBackup();
	}
}