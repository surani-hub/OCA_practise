import java.util.function.Predicate;

class MyCalendar{
	public static void main(String[] args){
		Season season1 = new Season();
		season1.name = "Spring";
		
		Season season2 = new Season();
		season2.name = "Autumn";
		
		Predicate<String> aSeason = (s) -> s == "Summer" ;// ? season1.name : season2.name;

		season1 = season2;
		System.out.println(season1.name);
		System.out.println(season2.name);
		System.out.println(aSeason.test(new String("Summer")));
		
	}
}