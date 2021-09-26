public class Performance implements SpeakDialogue, SingleMonologue{
	public int talk(String... x){
		return x[0].length();
	}
	
	public int talk(){
		return 5;
	}
	public static void main(String[] args){
		System.out.println(new Performance().talk("notes","",""));
	}
}