import java.util.*;

class CommonExceptionClasses{
	
	/*
	public void login(String userName, String pwd, int maxLoginAttempts){
			if(userName == null || userName.length() <6){
				throw new IllegalArgumentException("Login:username can't be shorter than 6 chars");
			}
			
			if(pwd == null || pwd.length() < 6){
				throw new IllegalArgumentException("Login:password can't be shorter than 6 chars");
			}
			
			if(maxLoginAttempts > 3){
				throw new IllegalArgumentException("Login:invalid login attempt val");
			}
		
	}
	*/
	
	//static ArrayList<String> list;
	//static String[] oldLaptops = new String[5];
	
	public static void main(String[] args){
		
		/*
		String[][] oldLaptops = {
			{"Dell", "Vaio", "Toshiba"},
			null,
			{"IBM"},
			new String[10]
		};
		
		System.out.println(oldLaptops[0][0]); // Dell
		System.out.println(oldLaptops[1]); //null
		System.out.println(oldLaptops[3][6]); //null
		//System.out.println(oldLaptops[3][0].length()); // NullPointerException
		System.out.println(oldLaptops); // [[Ljava.lang.String;@hashcode
		*/
		
		//System.out.println(12.0/0);
		
		/*
		int a = 10;
		int y = a++;
		int z = y--;
		
		int x1 = a - 2*y - z;
		int x2 = a - 11;
		double x3 = x2;
		
		double x = x1 / x3;
		
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x3);
		*/
		
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("+123"));
		//System.out.println(Integer.parseInt("123_45"));
		System.out.println(Integer.parseInt("12ABCD", 16));
				
		/*
		String[] seasons = {"Spring", "Summer"};
		
		ArrayList<String> exams = new ArrayList<>();
		exams.add("SCJP");
		exams.add("SCWCD");
		*/
		
		//System.out.println(seasons[2]);
		//System.out.println(seasons[-2]);
	
		//System.out.println(exams.get(-1));
		//System.out.println(exams.get(2));
		
		/*
		CommonExceptionClasses ce = new CommonExceptionClasses();
		ce.login("SudhaRani", "Rani", 4);
		*/
		
		/*
		ArrayList<String> list = null;
		
		CommonExceptionClasses ce = new CommonExceptionClasses();
		// ce.list.add("1");
		list.add("1");
		*/
		
		// System.out.println(oldLaptops[0]);	
		
	}
}