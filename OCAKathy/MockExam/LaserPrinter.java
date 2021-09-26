class LaserPrinter extends Printer{
	int pagesPerMin;
	
	public static void main(String[] args){
		Printer printer = new LaserPrinter();
		
		System.out.println(((LaserPrinter)printer).pagesPerMin);
	}
}

