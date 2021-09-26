import java.io.*;

public class Diamond extends CarbonStructure{
	public Diamond(){
		super(15);
	}
	
	public Long getCount() throws FileNotFoundException{
		return count;
	}
	
	public static void main(String[] args){
		try{
			final CarbonStructure ring = new Diamond();
			System.out.println(ring.getCount());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}