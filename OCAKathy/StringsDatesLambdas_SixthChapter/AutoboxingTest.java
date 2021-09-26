class AutoboxingTest{
	public static void main(String[] args){
		
		/*
			Integer can refer to same objects within the range -128 to 127. 
			Out of range, then == return false.
		*/
		
		Integer i = -129;
		Integer i2 = -129; 
		
		if(i == i2){
			System.out.println("same objects");
		}
		
		if(i.equals(i2)){
			System.out.println("meaningfully equal");
		}
	}
}