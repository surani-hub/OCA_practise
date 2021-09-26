class Chair implements JumpableOne, MoveableOne{
	int height = 3;
	Chair(){
		worldRecord();
	}
	
	public static void main(String[] args){
		JumpableOne j = new Chair();
		MoveableOne m= new Chair();
		Chair c = new Chair();
	}
}