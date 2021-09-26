class DVD extends CD{
	int c;
	
	DVD(int r, int c){
		super(r);
		this.c = c;
	}
	
	public static void main(String[] args){
		DVD dvd = new DVD(10,20);
	}
}