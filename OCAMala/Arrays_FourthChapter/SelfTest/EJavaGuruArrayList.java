import java.util.ArrayList;

class EJavaGuruArrayList{
	public static void main(String[] args){
		ArrayList<String> ejg = new ArrayList<>();
		ejg.add("One");
		ejg.add("Two");
		
		System.out.println(ejg.contains(new String("One")));
		System.out.println(ejg.indexOf("Two"));
		
		ejg.clear();
		
		System.out.println(ejg);
		
		System.out.println(ejg.get(0));
	}
}