class Bottle{
	public static void main(String[] args){
		String opt = "true";
		
		// boolean opt = true;
		
		switch(opt){
			case "true" : System.out.println("True");
							break;
			default :
					System.out.println("****");
		}
		
		System.out.println("Done");
		
		int num = 5;
		do{
			System.out.println(num-- + " ");
		}while(num == 0);
		
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a<b)
					?
					(a<c)
					?
					a
					:
					(b<c)
					?
					b
					:
					c;
		
		System.out.println(d);
	}
}