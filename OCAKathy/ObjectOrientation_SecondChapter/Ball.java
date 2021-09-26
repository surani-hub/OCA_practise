abstract class Ball implements Bounceable{
	public void bounce(){
		System.out.println("Bouncing");
	}
	
	public void setBounceFactor(int bf){
		System.out.println("bounce factor is " + bf);
	}
	
}