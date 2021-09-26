class TestSpecial{
	public static void main(String[] args){
		Special s = new Special();
		StringBuilder sName = s.getName();
		
		sName.append("fred");
		
		s.printName();
		
		System.out.println(sName);
		
	}
}