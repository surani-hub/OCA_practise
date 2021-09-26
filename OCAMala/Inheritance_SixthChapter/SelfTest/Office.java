class Office{
	public static void main(String[] args){
		
		Employee emp = new Employee();
		Employee programmer = new Programmer();
		
		System.out.println(emp.name); // Employee
		System.out.println(programmer.name); // Employee
		
		emp.printName(); // Employee
		programmer.printName(); // Programmer
	
	
		/*
		HRExecutive hr = new HRExecutive();
		hr.specialization = new String[]{"Staffing"};
		System.out.println(hr.specialization[0]);
		hr.name = "Pavni Gupta";
		System.out.println(hr.name);
		hr.conductInterview();
		*/
		
		/*
		Employee emp = new HRExecutive();
		emp.specialization =  new String[]{"Professor"};
		emp.name = "Sudha Murthy";
		System.out.println(emp.name);
		emp.conductInterview();
		*/
		
		/*
		Interviewer interviewer = new HRExecutive();
		interviewer.specialization = new String[]{"Programmer"};
		interviewer.name = "Ratan Tata";
		System.out.println(interviewer.name);
		interviewer.conductInterview();
		*/
		
		/*
		Interviewer[] interviewers = new Interviewer[2];
		interviewers[0] = new HRExecutive();
		interviewers[1] = new Employee();
		
		for(Interviewer interviewer : interviewers)
			interviewer.conductInterview();
		*/

		/*
		Interviewer interviewer = new HRExecutive();
		((HRExecutive)interviewer).specialization =  new String[]{"Staffing"};
		
		System.out.println(((HRExecutive)interviewer).specialization[0]);
		*/
		
		/*
		Interviewer[] interviewer = new Interviewer[2];
		interviewer[0] = new Manager();
		interviewer[1] = new HRExecutive();
		
		for(Interviewer inter : interviewer){ // manager, hrexecutive
			if(inter instanceof Manager){ // 
				int teamSize = ((Manager)inter).teamSize;
				if(teamSize>10){
					inter.conductInterview();
				} else{
					System.out.println("Manager cann't interview with team size less than 10");
				}
			}else{
				if(inter instanceof HRExecutive){
					inter.conductInterview();
				}
			}
		}
		*/
		
	}
}