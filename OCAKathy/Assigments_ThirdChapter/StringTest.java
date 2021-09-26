class StringTest{
	public static void main(String[] args){
		String x = "Java";
		String y = x;
		
		System.out.println("y string is "+ y);
		
		x = x + "Beans";
		
		System.out.println("y string is "+ y);
	}
}