class MultipleReturn{
	String getInt(){
		//int returnVal = 10;
		
		String returnVal = new String("10");
		
		try{
		String[] students = {"Harry", "Paul"};
		System.out.println(students[5]);
		} catch(Exception e){
			System.out.println("About to return "+ returnVal);
			return returnVal;
		}finally{
			//returnVal += 10;
			returnVal.concat("10");
			System.out.println("returnVal now is " + returnVal);
		}
		return returnVal;
	}
	
	public static void main(String[] args){
		MultipleReturn m = new MultipleReturn();
		System.out.println("In main " + m.getInt());
	}
}