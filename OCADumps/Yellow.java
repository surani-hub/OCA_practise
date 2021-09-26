class Yellow{
	static int count = 0;
	int i = 0;
	
	public void changeCount(){
		while(i<5){
			i++;
			count++;
		}
	}
	
	public static void main(String[] args){
		Yellow check1 = new Yellow();
		Yellow check2 = new Yellow();
		
		check1.changeCount();
		check2.changeCount();
		
		System.out.println(check1.count + " : "+ check2.count);
	}
}