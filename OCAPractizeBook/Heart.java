public class Heart extends Organ{
	public void operate(){
		System.out.println("beat");
	}
	
	public static void main(String[] args) throws Exception{
		try{
			new Heart().operate();
		}finally{
		
		}
	}
}