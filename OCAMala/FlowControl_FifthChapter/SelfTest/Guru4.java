class Guru4{
	public static void main(String[] args){
		
		/*
		boolean myValue = false;
		
		if(myValue = true){
			for(int i = 0; i < 2; i++){
				System.out.println(i);
			} 
		} else {
					System.out.println("else");
			}
		*/
		
		int i = 0;
		for(; i < 2 ; i = i + 5){
			if(i < 5)
			continue;
		System.out.println(i);
		}
		System.out.println(i);
	}
}