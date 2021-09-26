class ProjectOne{
	public static void main(String[] args){
		InterviewerOne interviewer = new ManagerOne();
		interviewer.submitInterviewerStatus(); // Manager:Accept
		
		ManagerOne manager = new ManagerOne();
		manager.submitInterviewerStatus(); // Manager:Accept
	}
}