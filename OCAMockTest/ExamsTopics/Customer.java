public class Customer{
	ElectricAccount acct = new ElectricAccount();
	
	public void useElectricity(double kWh){
		acct.addKWh(kWh);
		//System.out.println(acct.addKWh(kWh));
		
	}
	
	
}