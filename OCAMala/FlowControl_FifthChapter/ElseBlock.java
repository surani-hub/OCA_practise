class ElseBlock{
	public static void main(String[] args){
		
		/*
		boolean testValue = false;
		
		if(testValue == true);
		else
			System.out.println("value is true");*/
		
		/*
		String name = "Lion";
		int score = 100;
		
		if(name.equals("Lion")){
			score = 200;
			name = "Larry"; 
		} else
			score = 129;
			
		System.out.println(score);
		System.out.println(name);
		*/
		
		/*
		String name = "Lion";
		if(name.equals("Lion"))
			for(int i = 0; i<3; i++)
				System.out.println(i);
		*/
		
		/*
		int score = 100;
		boolean allow = false;
		String name = "Lion";
		
		if(score == 100); // true
		if(name == "Lio"); //false
		if(score <= 100 || allow); //true
		if(allow == true)		// false
			System.out.println("value is true");
		else
			System.out.println("value is false");
		*/
		
		/*
		int score = 110;
		if(score >200){
			if(score < 400)
				if(score > 300)
					System.out.println(1);
				else
					System.out.println(2);
		}			
		else
			System.out.println(3);
		*/
		
		int bill = 200;
		int discount = bill > 2000? bill-150 : bill-100;
		System.out.println(discount);
	}
}



