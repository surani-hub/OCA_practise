class Spock{
	public static void main(String[] args){
		int mask = 0;
		int count = 0;
		
		if(((5 < 7) ||(++count < 0)) | mask++ < 10)
			mask =  mask + 1;
			
		if((6 > 8) ^ false)
			mask = mask + 10;
			
		if(!(mask > 1) && ++count > 1)
			mask = mask + 100;
			
		System.out.println(mask + " " + count);
	}
}