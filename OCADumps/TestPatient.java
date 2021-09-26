import java.util.*;

public class TestPatient{
	public static void main(String[] args){
		List<Patient> ps = new ArrayList<>();
		
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		
		int f = ps.indexOf(p2);
		
		if(f>=0)
			System.out.println("Mike Found");
	}
}