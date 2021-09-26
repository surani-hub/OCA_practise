class SwitchString{
	public static void main(String[] args){
		String s = "yellow";
		
		switch(s){
			default: System.out.println("done");
			case "red": System.out.println("red");
						
			case "green": System.out.println("green");
							
			
			case "blue": System.out.println("blue");
							
			case "Green": System.out.println("Green");
							
			
		}
		System.out.println("out of switch");
	}
}