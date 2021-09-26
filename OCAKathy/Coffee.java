class Coffee{
	CoffeeSize size;
	
	public static void main(String[] args){
		Coffee c1 = new Coffee();
		c1.size = CoffeeSize.BIG;
		
		Coffee c2 = new Coffee();
		c2.size = CoffeeSize.OVERWHELMING;
		
		System.out.println(c1.size.getOunces());
		System.out.println(c2.size.getOunces());
		
		for(CoffeeSize s : CoffeeSize.values()){
			System.out.println(s + " " + s.getOunces());		
		}
		
		System.out.println("***************Line Seperator*****************");
		
		System.out.println(c1.size.getLidCode());
		System.out.println(c2.size.getLidCode());
	
	}
}