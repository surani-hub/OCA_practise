import java.awt.Dimension;

class ObjectReferenceTest{
	public static void main(String[] args){
		Dimension d = new Dimension(5,10);
		ObjectReferenceTest rt = new ObjectReferenceTest();
		System.out.println("Before, height = " +d.height);
		
		rt.modify(d);
		
		System.out.println("After, height = " +d.height);
		
	}
	
	void modify(Dimension dim){
		dim.height += 1;
		System.out.println("Dim height = " +dim.height);
	}
}