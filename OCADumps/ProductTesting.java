class ProductTesting{
	public static void main(String[] args){
		ProductOne p1 = new ProductOne("Hen", 101);
		ProductOne p2 = new ProductOne("Hen", 101);
		ProductOne p3 = p1;
		
		boolean ans1 = p1 == p2;
		boolean ans2 = p1.name.equals(p2.name);
		
		System.out.println(ans1 +" : " + ans2);
	}
}