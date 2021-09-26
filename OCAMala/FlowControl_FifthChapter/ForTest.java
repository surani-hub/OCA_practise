import java.util.ArrayList;

class ForTest{
	public static void main(String[] args){
		
		/*
		int ctr = 12;
		for(int j=10, k=14; j<= k; ++j,k=k-1,ctr--)
			System.out.println(j+" "+ k+" "+ctr);
		
		int tableOf = 25;
		for(int i = 1, num= 100000; i<=5;i++){
			System.out.println(tableOf * i);
			System.out.println(num * i);
		}
		
		String line = "ab";
		for(int i=0;i<line.length();++i,printMethod())
			System.out.println(line.charAt(i));
	}
	
	private static void printMethod(){
		System.out.println("Happy");
	}
	*/
	
	/*
	for(int hrs=1;hrs<=6;hrs++){
		for(int mins=1;mins<=60;mins++){
			System.out.println(hrs +":"+ mins);
		}
	}
	*/
	
	/*
	int multiArr[][];
	multiArr = new int[2][3];
		
		for(int i=0;i<multiArr.length;i++){
			for(int j=0;j<multiArr[i].length;j++){
				multiArr[i][j] = i + j;
				System.out.println("multiArr["+i+"]["+j+"] = " +multiArr[i][j]);
			}
		}
	*/
	
	/*
	ArrayList<String> myArr = new ArrayList<>();
	myArr.add("Java");
	myArr.add("Loop");
	
	for(String val: myArr)	
		System.out.println(val);
	*/
	
	/*
	ArrayList<String> exams = new ArrayList<>();
	exams.add("Java");
	exams.add("Oracle");
	
	ArrayList<String> levels = new ArrayList<>();
	levels.add("Basic");
	levels.add("Advanced");
	
	ArrayList<String> grades = new ArrayList<>();
	grades.add("Pass");
	grades.add("Fail");
	
	ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<ArrayList<String>>();
	nestedArrayList.add(exams);
	nestedArrayList.add(levels);
	nestedArrayList.add(grades);
	
	for(ArrayList<String> nestedElement: nestedArrayList)
		for(String element: nestedElement)
			System.out.println(element);
	*/
	
	/*
	int total = 0;
	int[] primeNums = {2,3,4,5};
	for(int num:primeNums){
		total += num;
	}
	System.out.println(total);
	// System.out.println(primeNums[]);
	*/
	
	/*
	StringBuilder[] myArr = { new StringBuilder("Java"), new StringBuilder("Oracle")};
	
	for(StringBuilder val:myArr)
		System.out.println(val);
	
	for(StringBuilder val: myArr)
		val = new StringBuilder("Loop");
		//val.append("Loop");
		
	for(StringBuilder val:myArr)
		System.out.println(val);
	*/
	
	/*
	ArrayList<StringBuilder> myList = new ArrayList<StringBuilder>();
	myList.add(new StringBuilder("one"));
	myList.add(new StringBuilder("two"));
	
	for(StringBuilder val:myList)
		System.out.println(val);
	
	for(StringBuilder val:myList)
		val = null;
	
	for(StringBuilder val:myList)
		System.out.println(val);
	*/
	
	ArrayList<String> exams = new ArrayList<>();
	exams.add("Java");
	exams.add("Oracle");
	
	ArrayList<String> levels = new ArrayList<>();
	levels.add("Basic");
	levels.add("Advanced");
	
	ArrayList<String> grades = new ArrayList<>();
	grades.add("Pass");
	grades.add("Fail");
	
	for(String exam:exams)
		for(String level:levels)
			for(String grade: grades)
				System.out.println(exam+" : "+ level +" : "+ grade);
	}
}