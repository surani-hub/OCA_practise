public class MarkList{
	
	int num;
	
	public static void main(String[] args){
		MarkList obj1 = new MarkList();
		MarkList obj2 = obj1;
		MarkList obj3 = null;
		
		obj2.num = 60;
		
		System.out.println(graceMarks(obj2));
		
		System.out.println(obj1.num);
		System.out.println(obj2.num);
		//System.out.println(obj4.num);
		System.out.println();
		
	}
	
	public static int graceMarks(MarkList obj4){
		return obj4.num += 10;
	}
}