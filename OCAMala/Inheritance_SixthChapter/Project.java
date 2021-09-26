import java.time.LocalDateTime;

class Project{
	public static void main(String[] args){
		
		/*
		Interviewer ivr = new Manager();
		//inv.bookConferenceRoom(LocalDateTime.now(), 2);
		
		Manager mgr =  new Manager();
		//mgr.bookConferenceRoom(LocalDateTime,now(), 2);
		
		Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);
		*/
		
		Employee emp = new Employee();
		emp.defaultPlan();
		
		Programmer pgr = new Programmer();
		pgr.defaultPlan();
		
		Employee.defaultPlan();
		Programmer.defaultPlan();
	}
}