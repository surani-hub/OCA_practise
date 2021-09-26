class Song{
	public void playMusic(){
		System.out.println("Play");
	}
	
	public static int playMusic(){
		System.out.println("Music!");
	}
	
	public static void main(String[] tracks){
		new Song().playMusic();
	}
}