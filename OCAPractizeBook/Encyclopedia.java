class Encyclopedia extends Book{
	public static String material = "cellulose";
	
	public Encyclopedia(){
		super();
	}
	
	public String getMaterial(){
		return material;
	}
	
	public static void main(String[] pages){
		System.out.println(new Encyclopedia().getMaterial());
	}
}