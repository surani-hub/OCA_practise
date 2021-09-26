import java.util.*;

class EbookTwo //extends BookTwo
{
	/*
	public void readBook(){
		System.out.println("Read-Ebook");
	}
	*/
	public static void main(String[] args){
		//BookTwo book1 = new EbookTwo();
		//book1.readBook();
		
		List<String> colors = new ArrayList<>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		
		colors.remove(2);
		
		colors.add(3,"cyan");
		
		System.out.println(colors);
		
		
		
	}
}