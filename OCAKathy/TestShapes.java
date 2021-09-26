// Checking Inheritance concept -- calling methods by passing object references of subclass and same class itself.
class TestShapes{
	public static void main(String[] args){
		
		PlayerPiece p = new PlayerPiece();
		p.displayShape();
		p.movePiece();
		System.out.println();
		
		TilePiece t = new TilePiece();
		t.getAdjacent();
		t.movePiece();
		t.displayShape();
		System.out.println();
		
		System.out.println("***************Line Separator******************");
		doShapes(p);
		doShapes(t);
		
		System.out.println();
		doShapes1(p);
		doShapes1(t);
		
		System.out.println();
		doShapes2(t);
		// doShapes2(p);
		
		System.out.println("**********************************************************************");
		PlayerPiece player = new PlayerPiece();
		GameShape shape = player;
		Animatable anim = player;
		Object o = player;
		
		player.displayShape();
		shape.displayShape();
		
	
	}
	
	public static void doShapes(GameShape s){
		s.displayShape();
	}
	
	public static void doShapes1(PlayerPiece s){
		s.displayShape();
		s.movePiece();
	}
	
	public static void doShapes2(TilePiece s){
		s.displayShape();
		s.getAdjacent();
		s.movePiece();
	}
}