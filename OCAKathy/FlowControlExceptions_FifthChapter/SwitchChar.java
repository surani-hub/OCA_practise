class SwitchChar{
	public static void main(String[] args){
		char c = 'd';
		
		switch(c){
			
			case 'a': System.out.println("character 'a' is printed"); break;
			case 'b': System.out.println("character 'b' is printed"); break;
			case 'c': System.out.println("character 'c' is printed"); break;
			
			case 'e': System.out.println("character 'd' is printed"); break;
			default: System.out.println("no character is printed");
			
		}
	}
}