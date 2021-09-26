import java.util.*;

class ArrayListTest{
	public static void main(String[] args){
		List<String> myList = new ArrayList<>();
		
		myList.add("Oslo");
		myList.add("Paris");
		myList.add("Rome");
		
		int index = myList.indexOf("Paris");
		
		System.out.println(myList + " " + index);
		
		myList.add(index, "London");
		
		System.out.println(myList);
		
		myList.clear();
		
		myList.add("Jan");
		myList.add("Feb");
		myList.add("March");
		myList.add("April");
		
		System.out.println(myList);
		
		System.out.println(myList.contains("April"));
		System.out.println(myList.contains("May"));
		
		System.out.println(myList.get(2));
		
		System.out.println(myList.indexOf("April"));
		
		myList.remove(1);
		
		System.out.println(myList.size() + "     " + myList);
		
	}
}