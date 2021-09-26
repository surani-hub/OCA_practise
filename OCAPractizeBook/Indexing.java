import java.time.LocalTime;

public class Indexing{
	
	static int[][] game;
	
	public static void main(String[] books){
		
		/*
		final String ceiling = "up";
		String floor = new String("up");
		//final String wall = new String(floor);
		
		final String wall = floor;
		
		System.out.println((ceiling==wall)+" "+(floor==wall)+" "+(ceiling.equals(wall)));
		//  false - false - true
		// false - true - true
		*/
		
		/*
		String lol = "lol";
		
		System.out.println(lol.toUpperCase() == lol); //false
		System.out.println(lol.toUpperCase() == lol.toUpperCase()); //false
		System.out.println(lol.toUpperCase().equals(lol)); // false
		System.out.println(lol.toUpperCase().equals(lol.toUpperCase())); //true
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol)); // true
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase())); // true
		System.out.println();
		System.out.println();
		*/
		
		/*
		String race = "";
		
		outer: 
		do{
			inner:
			do{
			race += "x";
		}while(race.length() <= 4);
		}while(race.length() < 4);
		
		System.out.println(race);
		*/
		
		LocalTime time = LocalTime.of(1,11);
		while(time.getHour() < 1){
			time.plusHours(1);
			System.out.println("in loop");
		}
		
		game[3][3] = 6;
		Object[] obj = game;
		obj[3] = 'X';
		System.out.println(game[3][3]);
				
		
		/*
		StringBuilder sb = new StringBuilder();
		
		for(String book : books)
			sb.insert(sb.indexOf("c"), book);
			
		System.out.println(sb);
		*/
		
		/*
		int[] crossword[] = new int[10][20];
		
		for(int i=0;i<crossword.length;i++){
			for(int j=0;j<crossword.length;j++){
				crossword[i][j] = 'x';
				System.out.println("crossword["+i+"]["+j+"]=" + crossword[i][j]);
			}
		}
		
		System.out.println(crossword.length);
		*/
		
	}
}