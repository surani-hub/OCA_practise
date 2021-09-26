import java.time.LocalDateTime;

interface Interviewer{
	// public void conductInterview();
	default Object submitInterviewStatus(){
		System.out.println("Accept");
		return null;
	}
	
	/*
	static void bookConferenceRoom(LocalDateTime dateTime, int duration){
		System.out.println("Interview scheduled on : " + dateTime);
		System.out.println("Book conference room for : " + duration + " hrs");
	}
	*/
	
}