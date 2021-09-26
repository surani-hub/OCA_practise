class Dark{
	int x = 3;
	
	public static void main(String[] args){
		new Dark().go1();
		System.out.println(new Dark().x);
	}
	
	void go1(){
		int x = 10;
		go2(++x);
		System.out.println(x);
	}
	
	void go2(int y){
		int x = ++y;
		System.out.println(x);
	}
}