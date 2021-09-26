import java.awt.Dimension;

class ReferenceTest{
	public static void main(String[] args){
		Dimension d = new Dimension(4,8);
		System.out.println("d.height = "+ d.height);
		
		Dimension b = d;
		b.height = 40;
		
		System.out.println("d.height = "+d.height);
		
		
	}
}