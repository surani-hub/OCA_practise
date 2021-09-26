class Clip{
	public static void main(String[] args){
		if(args[0].equals("Hello") ? false : true){
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
		
		String[] planets = {"Mercury", "Venus", "Pluto", "Mars"};
		
		System.out.println(planets.length);
		System.out.println(planets[1].length());
		
	}
}