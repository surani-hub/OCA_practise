class UseBoxing{
	public static void main(String[] args){
		UseBoxing u = new UseBoxing();
		System.out.println(u.go(5));
	}
	
	boolean go(Integer n){
		Boolean ifSo = true;
		Short s = 30;
		
		if(ifSo){
			System.out.println(++s);
		}
		
		return !ifSo;
	}
}