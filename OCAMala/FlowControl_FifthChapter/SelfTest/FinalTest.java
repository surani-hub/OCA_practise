class FinalTest{
	public static void main(String[] args){
		int num = 120;
		final int num2;
		num2 = 20;
		
		switch(num){
			default: System.out.println("default");
			case 0: System.out.println("case1");
			case 10*2-20: System.out.println("case2");
						break;
		}
	}
}