class Tirupati{
	
	int a1;
	 public static int doProduct(int a){
		return a = a*a;
	 }
	 
	 public static void doString(StringBuilder s){
		s.append(" " + s);
	}
	
	
	public static void main(String[] args){
			Tirupati item = new Tirupati();
			item.a1 = 11;
			
			StringBuilder sb = new StringBuilder("Hello");
			
			Integer i = 10;
			
			doProduct(i);
			doString(sb);
			doProduct(item.a1);
			
			System.out.println(i +" "+sb+" "+item.a1);
			
			System.out.println(doProduct(i) +"  "+ doProduct(item.a1));
	}
}