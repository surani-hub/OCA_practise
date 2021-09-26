package building;
import library.Book;

class StoryBook extends Book{
	public StoryBook(){
		author = "ABC";
		modifyTemplate();
	}
	
	public static void main(String[] args){
		StoryBook story = new StoryBook();
	}
}