public class Stranger{
	
	public static String getFullName(String firstName, String lastName){
		try{
			return firstName.toString() + " " + lastName.toString();
		}catch(NullPointerException npe){
			System.out.println("Problem?");
		}finally{
			System.out.println("Finished!");
		}
		return null;
	}
	
	public static void main(String[] args){
		System.out.println(getFullName("Joyce","Hopper"));
	}
}