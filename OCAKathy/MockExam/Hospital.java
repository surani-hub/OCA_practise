class Hospital{
	public static void main(String[] args){
		Surgeon s1 = new Surgeon("Liver");
		Surgeon s2 = new Surgeon("Heart");
		
		s1.age = 45;
		
		System.out.println(s1.age + s2.getSpecialization());
		System.out.println(s2.age + s1.getSpecialization());
	}
}