public class Alligator{
	static int teeth;
	double scaleToughness;
	
	public Alligator(){
		teeth++;
		}
	
	public void snap(int teeth){
		System.out.println(teeth + " ");
		teeth--;
	}
	
	public static void main(String[] args){
		new Alligator().snap(teeth);
		new Alligator().snap(teeth);
	}
}