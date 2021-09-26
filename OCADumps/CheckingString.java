class CheckingString{
	public static void main(String[] args){
		String[] names =  {"Thomas", "Petera", "Joseph"};
		
		String[] pws = new String[3];
		
		int idx = 0;
		
		try{
			for(String s: names){
				pws[idx] = s.substring(2,6);
				idx++;
			}
		}catch(Exception e){
			System.out.println("Invalid Name");
		}
		
		for(String s: pws)
			System.out.println(s);
	}
}