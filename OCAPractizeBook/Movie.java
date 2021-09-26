class Movie extends Cinema{
	public Movie(String movie){
	super(name);
	}
	
	public static void main(String[] showing){
		System.out.println(new Movie("Another trilogy").name);
	}
}