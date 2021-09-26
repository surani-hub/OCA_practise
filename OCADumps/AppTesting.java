class AppTesting{
	
	String myStr = "7007";
	
	public static void main(String[] args){
	
		AppTesting at = new AppTesting();
		at.doStuff("9009");
	}
	
	public void doStuff(String str){
		
		int myNum = 0;
		
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		}catch(NumberFormatException e){
			System.out.println("Error");
		}
		System.out.println("myStr: " + myStr + " myNum:" + myNum);
		
	}
}