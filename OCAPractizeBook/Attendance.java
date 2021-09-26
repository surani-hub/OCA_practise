public class Attendance{
	private Boolean[] list = new Boolean[10];
	
	public int printTodayCount(){
		int count = 0;
		for(int i=0; i<10;i++){
			
			System.out.println(list[i]);
			
			if(list[i])
				++count;
		}
		return count;
	}
	
	public static void main(String[] args){
		new Attendance().printTodayCount();
	}
}