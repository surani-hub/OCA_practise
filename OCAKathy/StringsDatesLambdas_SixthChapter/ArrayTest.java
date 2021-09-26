class ArrayTest{
	public static void main(String[] args){
		int[] occupantNames = new int[4];   

		int[][] myArray = new int[3][];
		
		myArray[0] = new int[2];
		myArray[0][0] = 6;
		myArray[0][1] = 7;
		
		myArray[1] = new int[3];
		myArray[1][0] = 9;
		myArray[1][1] = 8;
		myArray[1][2] = 5;
		
		Dog[] myDogs = new Dog[6];
		for(int x=0; x<myDogs.length;x++){
				myDogs[x] = new Dog();
		}
		
		Dog puppy = new Dog("Fredo");
		Dog[] myDogsArray = {puppy, new Dog("CLover"), new Dog("Aiko")};
		
		int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};
		System.out.println(scores[0][1]); // 2
		System.out.println(scores[2][1]); // 4
		
		Cat[][] myCats = {{new Cat("Fluffy"), new Cat("Zeus")},
							{new Cat("Bilbo"), new Cat("Legolas"), new Cat("Bert")}
							};
	}
}