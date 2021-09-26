public class TwoArrays{
	public static void main(String[] args){
		int n[][] = {{1,3},{2,4}};
		
		System.out.println(n.length);
		
		for(int i=n.length-1; i>=0;i--){
			for(int y : n[i]){
				System.out.println(y);
			}
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);
		
	}
}