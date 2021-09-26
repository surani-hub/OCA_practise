class Home{
	public static void main(String[] args){
		PhoneOne po = new PhoneOne();
		// po.weight = -12.23;
		
		po.setWeight(-12.23);
		System.out.println(po.getWeight());
		
		po.setWeight(77712.34);
		System.out.println(po.getWeight());
		
		po.setWeight(12.23);
		System.out.println(po.getWeight());
		
	}
}