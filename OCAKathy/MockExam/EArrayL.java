import java.util.*;

class EArrayL{
	public static void main(String[] args){
	
	ArrayList<String> seasons = new ArrayList<>();
	
	seasons.add(0, "Sudha");
	seasons.add(1, "Spring");
	seasons.add(2, "Summer");
	seasons.add(3, "Autumn");
	seasons.add(4, "Winter");
	
	seasons.remove(3);
	
	for(String s : seasons)
		System.out.println(s);
	}
}