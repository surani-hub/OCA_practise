class Client{
	Bar myBar = new Bar();
	
	void changeIt(Bar myBar){
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is "+ myBar.barNum); //99
		
		// myBar = new Bar();
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt now is "+myBar.barNum); // 420
	}
	
	public static void main(String[] args){
		Client c = new Client();
		System.out.println("c.myBar.barNum is "+ c.myBar.barNum); // 28
		
		c.changeIt(c.myBar);  
		System.out.println("c.myBar.barNum after changeIt is "+ c.myBar.barNum); // 99
	}
}