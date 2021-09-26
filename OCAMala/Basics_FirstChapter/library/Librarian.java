package library;

class Librarian{
	public Librarian(){
		Book book = new Book();
		book.author = "ABC";
		book.modifyTemplate();
	}
	
	public static void main(String[] args){
		Librarian libra = new Librarian();
	}
}