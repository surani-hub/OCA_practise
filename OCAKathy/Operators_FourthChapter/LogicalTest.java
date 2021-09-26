class LogicalTest{
	public static void main(String[] args){
		int z = 5;
		
		if(++z > 5 || ++z > 6)
		z++;
		System.out.println(z);
		
		int x = 5;
		if(++x > 5 | ++x > 6)
		x++;
		System.out.println(x);
		
		System.out.println("XOR " + ((2<3)^(4>3)));
		
		if(!(7==5)){
			System.out.println("not equal");
			
		boolean t = true;
		boolean f = false;
		
		System.out.println("! " + (t & !f) + " " + f);
		
		
		System.out.println((-7-4) + " " + (-(7-4)));
		System.out.println((2+3*4) + " " + ((2+3)*4));
		System.out.println(7>5 && 2>3);
		System.out.println(true & false == false | true);
		
		}
	}
}