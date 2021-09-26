class Election{
	public static void main(String[] args){
		new Election().calculateResult(null, 203);
	}
	
	public void calculateResult(Integer candidateA, Integer candidateB){
		boolean process = candidateA == null || candidateA.intValue() < 10;
		
		System.out.println(process);
		
		System.out.println(candidateA);
		
		//boolean value = candidateA && candidateB;
		
		//System.out.println(process || value);
	}
}