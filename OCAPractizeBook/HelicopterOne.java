public class HelicopterOne{
	public int adjustPropellers(int length, String[] type){
		length++;
		type[0] = "LONG";
		return length;
	}
	
	public static void main(String[] args){
		final HelicopterOne h = new HelicopterOne();
		int length = 5;
		
		String[] type = new String[1];
		length = h.adjustPropellers(length,type);
		System.out.println(length+" "+type[0]);
	}
}