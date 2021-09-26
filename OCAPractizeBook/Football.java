class Football{
	public static Long getScore(Long timeRemaining){
		return 2 * timeRemaining;
	}
	
	public static void main(String[] refs){
		final long startTime = 4;
		System.out.println(getScore(startTime));
	}
}