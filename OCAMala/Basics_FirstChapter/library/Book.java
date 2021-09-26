package library;

public class Book{
	/* public access modifier working
	
	public String isbn;
	
	public void printBook(){
		System.out.println("checking public access");
	}*/
	
	protected String author;
	protected void modifyTemplate(){
		System.out.println("checking protected access");
	}
}