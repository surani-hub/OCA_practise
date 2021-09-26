class Ex1{
	public static void main(String[] args){
		int x = 10;
		int y = new Ex1().change(x);
		
		System.out.println(x+y);
		
		int i; 
        int j; 
        for (i=1; i < 4; i++) { 
           for (j=2; j < 4; j++) { 
              if (j == 3) { 
                 continue; 
              } 
              System.out.println("i: " + i + " j: " + j); 
           } 
        } 
		
		
		boolean myVal = false;
		if (myVal = true)
			for (int z = 0; z < 2; z++)
				System.out.println(z);
		else
			System.out.println("else");
	  
	}
	
	int change(int x){
		x = 12;
		return x;
	}
}