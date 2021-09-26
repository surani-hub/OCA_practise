class ElseTest{
	public static void main(String[] args){
		int x = 2;
		
		if(x == 3){}
		else if(x <4) {System.out.println("<4");}
		else if(x <2) {System.out.println("<2");}
		else  {System.out.println("else");}
		
		
		int y = 5;
		
		if((x > 3) && (y < 2) | true){
			System.out.println("true");
		}
	}
}