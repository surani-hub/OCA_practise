import java.time.LocalDate;

class AAA{
	public static void main(String[] args){
		int wd = 0;
		String[] days = {"sun","mon","wed","sat"};
		
		for(String s: days){
			switch(s){
				case "sat":
				case "sun": wd -= 1;
							break;
				case "mon": wd++;
				case "wed": wd += 2;
			}
		}
		
		System.out.println(wd);
		
		/*
		LocalDate date = LocalDate.of(2012,01,32);
		date.plusDays(10);
		System.out.println(date);
		*/
		
		int i = 10;
		int j = 20;
		int k = j += i/5;
		System.out.println(i +" "+ j +" "+ k);
	}
}