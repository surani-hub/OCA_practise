class ReportTool extends Tool implements Exportable{
	public void export(){
		System.out.println("RTool::export");
	}
	
	public static void main(String[] args){
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		
		callExport(aTool);
		callExport(bTool);
		
		float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 12_345.062f;
		float var2 = var1 + 1024;
		System.out.println(var2);
		
		
	}
	
	public static void callExport(Exportable ex){
		ex.export();
	}
}