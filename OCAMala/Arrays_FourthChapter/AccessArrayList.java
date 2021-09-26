import java.util.ArrayList;

class AccessArrayList{
	public static void main(String[] args){
		
		/*
		ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
		MyPerson p1 = new MyPerson("Shreya");
		MyPerson p2 = new MyPerson("Paul");
		
		myArrList.add(p1);
		myArrList.add(p2);
		myArrList.add(p2);
		
		for(MyPerson person : myArrList){
			System.out.println(person);
		}
		
		System.out.println();
		System.out.println(myArrList.contains(new MyPerson("Shreya"))); // false
		System.out.println(myArrList.contains(p1)); // true
		System.out.println();
		System.out.println(myArrList.indexOf(new MyPerson("Paul"))); // -1
		System.out.println(myArrList.indexOf(p2)); // 1
		System.out.println();
		System.out.println(myArrList.lastIndexOf(new MyPerson("Paul"))); // -1
		System.out.println(myArrList.lastIndexOf(p2)); // 2
		*/
		
		
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Feb");
		
		myArrList.add(sb1);
		myArrList.add(sb2);
		myArrList.add(sb2);
		
		for(StringBuilder ele : myArrList){
			System.out.println(ele);
		}
		
		ArrayList<StringBuilder> assignedArrList = myArrList;
		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>)myArrList.clone();
		
		System.out.println();
		System.out.println(myArrList == assignedArrList); // true
		System.out.println(myArrList == clonedArrList); // false
		System.out.println();
		
		StringBuilder myArrVal = myArrList.get(0); 
		StringBuilder assignedArrVal = assignedArrList.get(0); 
		StringBuilder clonedArrVal = clonedArrList.get(0); 
		System.out.println(myArrVal == assignedArrVal); // true
		System.out.println(myArrVal == clonedArrVal); // true
		
		/*
		System.out.println(myArrList.contains(new StringBuilder("Jan"))); // false
		System.out.println(myArrList.contains(sb1)); // true
		
		System.out.println(myArrList.indexOf(new StringBuilder("Jan"))); //-1
		System.out.println(myArrList.indexOf(sb1)); // 0
		System.out.println(myArrList.indexOf(sb2)); // 1
		
		System.out.println(myArrList.lastIndexOf(new StringBuilder("Feb"))); // -1
		System.out.println(myArrList.lastIndexOf(sb2)); // 2
		
		System.out.println(myArrList.lastIndexOf(sb1));  // 0
		*/
		
		/*
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("one");
		myArrList.add("two");
		
		for(String ele : myArrList){
			System.out.println(ele);
		}
		
		System.out.println(myArrList.get(0)); // one
		System.out.println(myArrList.size()); // 2
		
		
		myArrList.clear();
		
		for(String ele : myArrList){
			System.out.println(ele);
		}
		*/
		
	}
}