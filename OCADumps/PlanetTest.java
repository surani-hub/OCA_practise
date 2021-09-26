class PlanetTest{
	public static void main(String[] args){
		Planet[] planets = {
								new Planet("Mercury", 0),
								new Planet("Venus", 0),
								new Planet("Earth", 1),
								new Planet("Mars", 2),
		};
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].name);
		System.out.println(planets[2].moons);
		
		System.out.println("--------------------------------------------");
		
		int[] intArr = {15,30,45,60,75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		
		for(int i: intArr)
			System.out.println(i);
	}
}