import java.util.ArrayList;

public class Tiger extends Cat{
	public static void main(String[] args){
		
		ArrayList<Animal> myList = new ArrayList<>();
		myList.add(new Tiger());
		
		ArrayList<Hunter> myList1 = new ArrayList<>();
		myList.add(new Cat());
		
		ArrayList<Hunter> myList2 = new ArrayList<>();
		myList.add(new Tiger());
		
		ArrayList<Tiger> myList3 = new ArrayList<>();
		myList.add(new Cat());
		
		ArrayList<Animal> myList4 = new ArrayList<>();
		myList.add(new Cat());
		
	}
}