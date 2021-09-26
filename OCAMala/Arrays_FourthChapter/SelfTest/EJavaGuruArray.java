import java.util.ArrayList;

class EJavaGuruArray{
	public static void main(String[] args){
		int[] arr = new int[5];
		byte b = 4;
		char c = 'c';
		long longVar = 10;
		
		arr[0] = b;
		arr[1] = c;
		// arr[3] = longVar;
		
		System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
		
		ArrayList<Long> list = new ArrayList<>();
		list.add(10l);
	}
}