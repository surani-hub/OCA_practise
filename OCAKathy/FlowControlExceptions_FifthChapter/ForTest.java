class ForTest{
	public static void main(String[] args){
		int x = 3;
		
		for(x = 12; x < 20; x++){
		
		}
		
		System.out.println(x);
		
		int b = 3;
		for(int a = 1; b != 1; System.out.println("iterate")){
			b = b - a;
		}
		
		int[] a = {1,2,3,4};
		for(int n : a){
			System.out.println(n);
		}
	}
}