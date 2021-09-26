class EJavaGuruExcep{
	public static void main(String[] args){
		EJavaGuruExcep eg = new EJavaGuruExcep();
		eg.printArrayValues(args);
	}
	
	void printArrayValues(String[] arr){
		try{
			System.out.println(arr[0] +" : " + arr[1]);
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}