public class Gamma{
	public static void main(String[] args){
		Outer o = new Outer();
		Inner i = new Inner();
		
		int n = 10;
		
		i.setX(n);
		o.setY(i);
		
		// n = 100; -- 10
		
		// i.setX(100); -- 100 correct answer
		
		//o.getY().setX(100); -- 100 correct answer
		
	/*	i = new Inner();
		i.setX(100); -- 10
		*/
		
	/*	o.setY(i);
		i = new Inner();
		i.setX(100); -- 10
		*/ 
		
	/*	i = new Inner();
		i.setX(100);
		o.setY(i); -- 100 correct answer
		*/
		
		System.out.println(o.getY().getX());
	}
}