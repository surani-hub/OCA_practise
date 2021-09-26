class TestSportsThings{
	public static void main(String[] args){
	
	Car[] carThings = {new Car(), new Subaru(), new Ferrari()};
	
	Sporty[] sportyThings = new Sporty[4];
	
	sportyThings[0] = new Ferrari();
	sportyThings[1] = new RacingFlats();
	// sportyThings[2] = new Car();
	
	
	sportyThings[2] = new GolfClub();
	//sportyThings[3] = new Subaru();
	
	int[] weightList = new int[5];
	
	byte b = 4;
	short s = 9;
	char c = 'c';
	
	weightList[0] = b;
	weightList[1] = s;
	weightList[2] = c;
	
	Subaru[] subaruThings = new Subaru[3];
	carThings = subaruThings;
	
	Ferrari[] ferrariThings = new Ferrari[2];
	carThings = ferrariThings;
	
	
	Car[][] carNames = new Car[3][];
	carNames[0] = ferrariThings;
	carNames[1] = subaruThings;
	
	Subaru[][] subaru = new Subaru[2][];
	subaru[0] = new RacingFlats[1];
	
	
	}
}