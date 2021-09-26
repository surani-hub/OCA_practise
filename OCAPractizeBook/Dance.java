import java.util.*;

public class Dance{
	public static void swing(int... beats) throws ClassCastException{
		try{
			System.out.println("1"+beats[2]);
		}catch(RuntimeException e){
			System.out.println("2");
		}catch(Exception e){
			System.out.println("3");
		}finally{
			System.out.println("4");
		}
	}
	
	public static void main(String[] args){
		new Dance().swing(0,0);
		System.out.println("5");
		
		List<String> drinks = Arrays.asList("can","cup");
		
		for(int container=drinks.size();container>0;container++)
			System.out.println(drinks.get(container-1) +" ");
	}
}