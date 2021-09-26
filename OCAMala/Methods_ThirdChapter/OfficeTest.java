class OfficeTest{
	public static void main(String[] args){
		EmployeeTest e = new EmployeeTest();
		System.out.println(e.age);
		e.modifyVal(e.age);
		System.out.println(e.age);
	}
}