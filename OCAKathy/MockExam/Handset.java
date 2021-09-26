class Handset{
	
	double price;
	String model;
	
	public static void main(String[] args){
		// double price = 0;
		// String model = "sudha";
		Handset hands = new Handset();
		
		Keys varKeys = (region, keys) -> {if (keys >= 32)
											return region;
										else
											return "default";};
										
		System.out.println(hands.model + hands.price + varKeys.keypad("AB", 32));
	}
}