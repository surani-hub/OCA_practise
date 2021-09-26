public class Address{
	
	public String getAddress(String street, String city){
		try{
			return street.toString() + " " + city.toString();
		}finally{
			System.out.println("Posted!");
		}
	}
	
	public static void main(String[] args){
		String street = "350 5th Ave";
		String city = "New York";
		
		System.out.println(new Address().getAddress(street, city));
	}
}