import java.time.LocalDate;

public class Shoot{
	interface Target{
		boolean needToAim(double angle);
	}
	
	static void prepare(double angle, Target t){
		boolean ready = t.needToAim(angle);
		System.out.println(ready);
	}
	
	public static void main(String[] args){
		prepare(45, d -> d>5 || d<-5);
		
		LocalDate xmas = LocalDate.of(2016,12,25);
		xmas = xmas.plusDays(-1);
		
		System.out.println(xmas.getDayOfMonth());
		
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
		sb.delete(1,2);
		
		System.out.println(sb);
	}
}