class TestEmp{
	public static void main(String[] args){
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
		emp1.bankVault = 20;
		emp2.bankVault = 40;
		
		System.out.println(emp1.bankVault);
		System.out.println(emp2.bankVault);
		System.out.println(Emp.bankVault);
		
	}
}