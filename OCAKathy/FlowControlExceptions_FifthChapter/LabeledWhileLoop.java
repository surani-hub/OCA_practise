import java.util.Scanner;

class LabeledWhileLoop{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		outer:
			while(age <= 21){
								
				if(age == 16){
					System.out.println("get your driving license");
					continue outer;
				} 
				age += 1;
			}
			System.out.println("Another year");
			
			System.out.println("Age is " + age);
	}
}