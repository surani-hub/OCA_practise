class EJavaGuruString2{
	public static void main(String[] args){
		String ejg = "game".replace('a','Z').trim().concat("Aa");
		
		ejg.substring(0,2);
		System.out.println(ejg);
	}
}