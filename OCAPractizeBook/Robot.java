import java.io.*;

public class Robot extends Machine{
	public boolean turnOn() throws EOFException{
		return false;
	}
	
	public static void main(String[] args) throws Exception{
		Machine m = new Robot();
		
		System.out.println(m.turnOn());
	}
}