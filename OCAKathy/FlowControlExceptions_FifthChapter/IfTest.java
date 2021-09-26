class IfTest{
	public static void main(String[] args){
	 
	 int x = 2;
		if(x>3){
			System.out.println("x is greater than 3");
		} else {
			System.out.println("x is not greater than 3");
		}
		
		int y=0;
		int z = 0;
		int a = 0;
		
		if(x>5)
		y = 2;
		z += 8;
		a = y + x;
		
		System.out.println("X = " +x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
		System.out.println("a = "+a);
	}
}