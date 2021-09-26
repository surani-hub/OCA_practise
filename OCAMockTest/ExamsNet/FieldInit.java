class FieldInit{
	char c;
	boolean b;
	float f;
	
	void printAll(){
		System.out.print("c= "+c);
		System.out.print("b= "+b);
		System.out.println("f= "+f);
	}
	
	public static void main(String[] args){
		FieldInit f = new FieldInit();
		f.printAll();
	}
}