import java.io.*;

class ThrowNumberFormatException{
	
	/*
	static{
		int num = Integer.parseInt("sd", 16);
	}
	*/
	
	/* --- ExceptionInInitializerError only for static initialisers
	static String name = null;
	static int nameLength = name.length();
	*/
	
	public static void main(String[] args){
	
	convertToNum("16b");
	//convertToNum("54v");
	
	}
	
	public static int convertToNum(String val){
		int num = 0;
		
		try{
			num = Integer.parseInt(val, 16);
		}catch(Exception e){
			throw new NumberFormatException(val + "can't be converted to hexadecimal number");
		}
		return num;
	}
}