class Eggs{
	int doX(Long x, Long y){
		return 1;
	}
	
	int doX(long...x){
		return 2;
	}
	
	int doX(Integer x, Integer y){
		return 3;
	}
	
	int doX(Number x, Number y){
		return 4;
	}
		
		
	public static void main(String[] args){
		new Eggs().go();
	}
	
		void go(){
		long s = 7;
		System.out.print(doX(s,s) +" ");
		System.out.println(doX(7,7));
		}
}