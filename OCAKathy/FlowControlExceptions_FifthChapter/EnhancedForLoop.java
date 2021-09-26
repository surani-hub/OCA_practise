class EnhancedForLoop{
	public static void main(String[] args){
		int x;
		long x2;
		long[] la = {7L, 8L, 9L};
		int[][] twoDate = {{1,2,3},{4,5,6},{7,8,9}};
		String[] sNums = {"one", "two", "three"};
		//Animals[] animals = {new Dog(), new Cat()};
		
		
		for(long y : la) 
		System.out.print(y + "  ");
		System.out.println();
		
		for(int[] n : twoDate) 
		System.out.print(n +"   ");
		System.out.println();
		
		for(int b : twoDate[2]) 
		System.out.print(b + "   ");
		System.out.println();
		
		for(String s : sNums) 
		System.out.print(s + "   ");
		System.out.println();
		//for(Animals a : animals) System.out.println(a);
		
		for(Object o : sNums) 
		System.out.print(o + "    ");
		System.out.println();
		
	}
}