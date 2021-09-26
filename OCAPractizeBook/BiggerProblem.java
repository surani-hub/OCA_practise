public class BiggerProblem extends Problem{
	public static void main(String[] args){
		try{
			throw new BiggerProblem();
		}catch(BiggerProblem bp){
			System.out.println("Problem?");
		}catch(Problem p){
			System.out.println("Handled");
		}finally{
			System.out.println("Fixed!");
		}
	}
}