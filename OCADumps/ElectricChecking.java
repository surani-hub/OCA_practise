public class ElectricChecking{
	public static void main(String[] args){
		
		Customer custBill = new Customer();
		double bill = custBill.useElectricity();
		
		
		System.out.println(bill);
	}
}