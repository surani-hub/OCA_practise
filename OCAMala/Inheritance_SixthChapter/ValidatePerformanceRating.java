class ValidatePerformanceRating implements Validate{
	public boolean check(Emp e){
		return (e.getPerformanceRating() >= 5);
	}
}