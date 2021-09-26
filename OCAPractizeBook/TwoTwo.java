class TwoTwo implements PrinterOne{

	public int printData() throws PaperPrintException {
		return 10;
	}
	 
	
	public static void main(String[] args) throws Exception{
		TwoTwo two = new TwoTwo();
		System.out.println(two.printData());
	}
}