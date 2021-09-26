// Checking Inheritance concept
class PlayerPiece extends GameShape implements Animatable {
	public void movePiece(){
		System.out.println("Moving piece");
	}
	
	public void animate(){
		System.out.println("Animating playerPiece ");
	}
}