import java.util.*;
import java.util.function.*;

class TestDogs{
	public static void main(String[] args){
		ArrayList<DogTest> dogs = new ArrayList<>();
		
		dogs.add(new DogTest("boi", 30, 6));
		dogs.add(new DogTest("charis", 120, 7));
		dogs.add(new DogTest("clover", 35, 12));
		dogs.add(new DogTest("zooey", 45, 8));
		dogs.add(new DogTest("tyri", 40, 12));
		dogs.add(new DogTest("aiko", 50, 10));
		dogs.add(new DogTest("mia", 15, 4));
		
		System.out.println("all dogs are " + dogs);

		System.out.println("min age 7 " + minAge(dogs, 7).toString());
		System.out.println("max weight " + maxWeight(dogs, 40).toString());
		
		System.out.println("age < 9 : " + dogQuerier(dogs, d -> d.getAge() < 9));
		System.out.println("weight > 100 " + dogQuerier(dogs, d -> d.getWeight() > 100) );
		
	}
	
	static ArrayList<DogTest> minAge(ArrayList<DogTest> dogList, int testFor){
		ArrayList<DogTest> results1 = new ArrayList<>();
		
		for(DogTest d: dogList ){
			if(d.getAge() >= testFor){
					results1.add(d);
			}
		}
		return results1;
	}
	
	
	static ArrayList<DogTest> maxWeight(ArrayList<DogTest> dogList, int testFor){
		ArrayList<DogTest> results1 = new ArrayList<>();
		
		for(DogTest d: dogList ){
			if(d.getWeight() >= testFor){
					results1.add(d);
			}
		}
		return results1;
	}
	
	
	
	static ArrayList<DogTest> dogQuerier(ArrayList<DogTest> dogList, Predicate<DogTest> expr){
		ArrayList<DogTest> results1 = new ArrayList<>();
		
		for(DogTest d: dogList){
			if(expr.test(d)){
				results1.add(d);
			}
		}
		return results1;
	}
	
}