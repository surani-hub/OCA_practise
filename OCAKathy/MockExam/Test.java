class Test{
	public static void main(String[] args){

		/*
		// Jumpable var1 = new Jumpable(); cann't be instantiated
		Animal var2 = new Animal(); 
		// Lion var3 = new Animal(); 
		// Jumpable var4 = new Animal();
		Jumpable var5 = new Lion();
		// Jumpable var6 = (Jumpable)(new Animal());
		*/
		
		/*
		try{
			String[][] names = {{"Andre", "Mike"}, null, {"Pedro"}};
			System.out.println(names[2][1].substring(0,2));
		}catch(NullPointerException e){
			System.out.println(1);
		}
		*/
		
		//ColorPencil var1 = new ColorPencil();
		// ColorPencil var2 = new ColorPencil(RED);
		ColorPencil var3 = new ColorPencil("RED");
		Pencil var4 = new ColorPencil("BLUE");
		
	}
}