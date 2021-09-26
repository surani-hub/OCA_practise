interface InterviewerOne{
	default Object submitInterviewerStatus(){
		System.out.println("Interviewer:Accept");
		return null;
	}
}