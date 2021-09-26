public class Drum extends Instrument{
	public void play(int count){
	
	}
	
	public void concert(){
		super.play(5);
	}
	
	public static void main(String[] args){
		MakesNoise mn = new Drum();
		mn.concert();
	}
}