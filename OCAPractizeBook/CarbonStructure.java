import java.io.IOException;

abstract class CarbonStructure{
	protected long count;
	
	public abstract Number getCount() throws IOException;
	
	public CarbonStructure(int count){
		this.count = count;
	}
}