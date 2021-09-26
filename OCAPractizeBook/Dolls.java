class Dolls{
	public static void main(String[] args){
		System.out.println(new Dolls().nested());
	}
	
	public void nested(){
		nested(2,true);
	}
	
	public int nested(int level, boolean height){
		return nested(level);
	}
	
	public int nested(int level){
		return level+1;
	}
}