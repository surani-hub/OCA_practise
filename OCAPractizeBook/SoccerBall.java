public class SoccerBall extends Ball implements Equipment {
	public SoccerBall(){
		super(5);
	}
	
	public Ball get(){
		return this;
	}
	
	public static void main(String[] args){
		Equipment equipment = (Equipment)(Ball)new SoccerBall().get();
		System.out.println(((SoccerBall)equipment).size);
	}
}