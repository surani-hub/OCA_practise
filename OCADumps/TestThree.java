class TestThree{
	public static void main(String[] args){
		
		// Byte x = 1;
		// short x = 1;
		//Long x = 1;
		
		/*
		Integer x = new Integer("1");
		
		switch(x){
			case 1: System.out.println("One");
					break;
			case 2: System.out.println("Two");
					break;
		}
		*/
		
		/*
		String str = " ";
		String str1 = str.trim();;
		
		System.out.println(str.equals(" ")); // true
		System.out.println(str.equals("")); // false
		System.out.println(str.isEmpty()); // false
		System.out.println(str1.isEmpty()); // true
		*/
		
		Boolean[] bool = new Boolean[2];
		
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		
		System.out.println(bool[0] + " " + bool[1]);
		
	}
}