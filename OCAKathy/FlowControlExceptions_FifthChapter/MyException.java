import java.util.*;

class MyException{
	public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the food type");
	
	String foodType = s.next();
	
	checkFood(foodType);
	
	}
	
	static String checkFood(String s){
		
		try{
			if(s.equals("Chinese")){
				System.out.println("likes the food");
			} else {
				throw new BadFoodException();
			}
		} catch(BadFoodException e){
			System.out.println("bad food");
		}
		return s;
	}
}


