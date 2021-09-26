import java.util.ArrayList;
import java.util.ListIterator;

class CreateArrayList{
	public static void main(String[] args){
	
	/*
	ArrayList<String> myArrList = new ArrayList<>();
	myArrList.add("one");
	myArrList.add("two");
	myArrList.add("four");
	myArrList.add(2,"three");
	
	System.out.println(myArrList);
	System.out.println(" " );
	
	for(String element : myArrList){
		System.out.println(element +" length = "+element.length());
	}
	
	System.out.println(" ");
	
	ListIterator<String> iterator = myArrList.listIterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	System.out.println();
	
	myArrList.set(1,"one and half");
	System.out.println(myArrList);
	System.out.println(" ");
	
	ArrayList<StringBuilder> list = new ArrayList<>();
	list.add(new StringBuilder("one"));
	list.add(new StringBuilder("two"));
	list.add(new StringBuilder("three"));
	
	for(StringBuilder element : list){
		element.append(element.length());
	}
	
	for(StringBuilder element : list){
			System.out.println(element);
	}
	*/
	
	/*
	ArrayList<StringBuilder> myArrayList = new ArrayList<>();
	StringBuilder sb1 = new StringBuilder("one");
	StringBuilder sb2 = new StringBuilder("two");
	StringBuilder sb3 = new StringBuilder("three");
	StringBuilder sb4 = new StringBuilder("four");
	
	myArrayList.add(sb1);
	myArrayList.add(sb2);
	myArrayList.add(sb3);
	myArrayList.add(sb4);
	
	myArrayList.remove(1);
	
	for(StringBuilder element : myArrayList){
		System.out.println(element);
	}
	System.out.println();
	
	myArrayList.remove(sb3);
	
	myArrayList.remove(new StringBuilder("four"));
	System.out.println();
	
	for(StringBuilder element : myArrayList){
		System.out.println(element);
	}
	System.out.println();
	*/
	
	/*
	ArrayList<String> myArrList = new ArrayList<>(); 
	myArrList.add("one");
	myArrList.add("two");
	
	ArrayList<String> yourArrList = new ArrayList<>(); 
	yourArrList.add("three");
	yourArrList.add("four");
	
	myArrList.addAll(1, yourArrList);
	
	for(String element : myArrList){
		System.out.println(element);
	}
	 
	 // one three four two
	*/
	
	ArrayList<String> myArrList = new ArrayList<>();
	String one = new String("one");
	String two = new String("two");
	
	myArrList.add(one);
	myArrList.add(two);
	
	ArrayList<String> yourArrList = myArrList;
	
	for(String element : myArrList){
		System.out.println(element);
	}
	System.out.println(" ");
	
	for(String element : yourArrList){
		System.out.println(element);
	}
	System.out.println(" ");
	
	one.replace("O","B");
	
	for(String element : myArrList){
		System.out.print(element + ":");
	}
	System.out.println("  ");
	System.out.println(" ");
	
	for(String element : yourArrList){
		System.out.print(element + ":");
	}
	
	
	
	
	
	
	}
}