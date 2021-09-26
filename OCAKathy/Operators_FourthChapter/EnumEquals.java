class EnumEquals{
	enum COLOR{RED, BLUE}
	
	public static void main(String[] args){
		COLOR c1 = COLOR.RED;
		COLOR c2 = COLOR.RED;
		
		if(c1 == c2){
			System.out.println("==");
		}
		
		if(c1.equals(c2)){
			System.out.println("dot equals");
		}
	}
}