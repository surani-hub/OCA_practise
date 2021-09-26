class Ter{
	public static void main(String[] args){
		int bill = 2000;
		// int discount = (bill>2000)? getSpecDisc() : getRegDisc();
		int qty = 10;
		int days = 10;
		int discount = (bill>1000) ? (qty >11) ? 10 : days>9 ?20 : 30 :5;
		System.out.println(discount);
	}
	
	/*
	static int getSpecDisc(){
		return 11;
	}
	
	static int getRegDisc(){
		return 15;
	}
	*/
	
}