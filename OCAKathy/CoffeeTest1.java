class Coffee{
	enum CoffeeSize { BIG, HUGE, OVERWHELMING}
	static CoffeeSize size;
}

class CoffeeTest1{
	public static void main(String[] args){
	Coffee c = new Coffee();
	c.size = Coffee.CoffeeSize.BIG;
	System.out.println(c.size);
	
	}
}