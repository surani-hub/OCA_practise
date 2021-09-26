class CCMask{
	public static String maskCC(String creditCard){
		String x = "XXXX-XXXX-XXXX-";
		
		// return x+creditCard.substring(15,19);
		
		/*
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15,19);
		return sb.toString();
		*/
		
		StringBuilder sb = new StringBuilder(creditCard);
		sb.substring(15,19);
		return x+sb;
		
	}
	
	public static void main(String[] args){
		System.out.println(maskCC("1234-5678-9011-1121"));
	}
}