import java.util.ArrayList;

class TestBankDetails{
	public static void main(String[] args){
		
		BankAccount b1 = new BankAccount();
		b1.accountNumber = "0023940";
		b1.accType = 4;
		
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		list.add(b1);
		
		BankAccount b2 = new BankAccount();
		b2.accountNumber = "0023940";
		b2.accType = 4;
		
		System.out.println(list.contains(b2));
		
		
		/*
		BankAccount acct = new BankAccount();
		String str = "Bank";
		
		System.out.println(acct.equals(str)); // true
		System.out.println(str.equals(acct)); // false
		*/
		
		/*
		BankAccount b1 = new BankAccount();
		b1.accountNumber = "0023490";
		b1.accType = 4;
		
		BankAccount b2 = new BankAccount();
		b2.accountNumber = "11223344";
		b2.accType = 3;
		
		BankAccount b3 = new BankAccount();
		b3.accountNumber = "11223344";
		b3.accType = 3;
		
		System.out.println(b1.equals(b2)); // false
		System.out.println(b1.equals(b3)); // false
		System.out.println(b2.equals(b3)); // true
		*/
		
	}
}