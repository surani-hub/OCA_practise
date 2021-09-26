class MainTest{
	public static void main(int[] args){
		System.out.println("int main" + args[0]);
	}
	
	public static void main(Object[] args){
		System.out.println("Object main" + args[0]);
	}
	
	public static void main(String[] args){
		// System.out.println("String main" + args[0]);
		
		int[][] num = new int[1][3];
		
		System.out.println(num.length);
		
		/*
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;j++){
				num[i][j] = 10;
				System.out.println("num["+i+"]["+j+"] = " );
			}
		}
		*/
	}
	
	
}