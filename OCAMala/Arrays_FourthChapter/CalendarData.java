import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;

class CalendarData{
	public static void main(String[] args){
		
		// ------ LocalDateTime
		/*
		LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
		LocalDateTime dateTimeNow = LocalDateTime.now();
		
		if(prizeCeremony.getMonthValue() == 6)
			System.out.println("Can't invite president");
		else	
			System.out.println("President invited");
	
		
		LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");
		
		if(prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
			System.out.println("Chief guest will leave before ceremony completes");
		
		
		LocalDateTime eventMgrArrival = LocalDateTime.of(2050,6,5, 14,30,00);
		
		if(eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
			System.out.println("Manager is supposed to arrive 3 hours earlier");
		*/
		
		// ---------- Period
		/*
		Period period1 = Period.of(1,2,7);
		Period period2 = Period.ofYears(2);
		Period period3 = Period.ofMonths(5);		
		Period period4 = Period.ofWeeks(10);
		Period period5 = Period.ofDays(15);
			
		System.out.println(period1);
		System.out.println(period2);
		System.out.println(period3);
		System.out.println(period4);
		System.out.println(period5);
		
		System.out.println(Period.ofDays(-15));
		*/
		
		/*
		Period p5Yrs1 = Period.parse("P5y");
		Period p5Yrs2 = Period.parse("p5y");
		Period p5Yrs3 = Period.parse("P5Y");
		Period p5Yrs4 = Period.parse("+P5Y");
		Period p5Yrs5 = Period.parse("P+5Y");
		Period p5Yrs6 = Period.parse("-P-5Y");
		System.out.println(p5Yrs1 + " : " + p5Yrs5);
		
		Period p5Yrs7 = Period.parse("P5y1m1d");
		Period p5Yrs8 = Period.parse("p9m");
		Period p5Yrs9 = Period.parse("P60d");
		Period p5Yrs10 = Period.parse("-P5W");
		
		System.out.println(p5Yrs7);
		System.out.println(p5Yrs8);
		System.out.println(p5Yrs9);
		System.out.println(p5Yrs10);
		*/
		
		/*
		LocalDate carnivalStart = LocalDate.of(2050,12,31);
		LocalDate endDate = LocalDate.of(2051,1,2);
		
		Period periodBetween = Period.between(carnivalStart,endDate);
		System.out.println(periodBetween);
		
		LocalDate date = LocalDate.of(2052,01,31);
		System.out.println(date.plus(Period.ofDays(1)));

		LocalDateTime dateTime = LocalDateTime.parse("2052-01-31T14:18:36");
		System.out.println(dateTime.plus(Period.ofMonths(1)));
		*/
		
		/*
		LocalDateTime dateTime = LocalDateTime.parse("2020-01-31T14:18:36");
		System.out.println(dateTime.minus(Period.ofYears(2)));
		
		LocalDate date = LocalDate.of(2052,01,31);
		System.out.println(date.minus(Period.ofWeeks(4)));
		
		
		Period period = Period.of(2,4,40);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println();
		
		Period days = Period.of(0,0,5);
		System.out.println(days.isZero());
		
		Period daysNegative = Period.of(0,0,-5);
		System.out.println(daysNegative.isNegative());
		
		LocalDate bDay = LocalDate.of(2020,10,29);
		LocalDate today = LocalDate.now();
		
		Period period10Days = Period.of(0,0,10);
		
		if(bDay.minus(period10Days).isBefore(today))
			System.out.println("Time to send remindars to friends");
		
		Period period10Days = Period.of(0,0,10);
		Period period1Month = Period.of(0,1,0);
		
		System.out.println(period10Days.minus(period1Month));
		System.out.println(period10Days.minusDays(5));
		System.out.println(period10Days.minusMonths(5));
		System.out.println(period10Days.minusYears(5));
		
		Period year1Month9Day20 = Period.of(1,9,20);
		System.out.println(year1Month9Day20.multipliedBy(2));
		System.out.println(year1Month9Day20.multipliedBy(-2));
		*/
		
		/*
		Period period5Months = Period.of(0,5,0);
		Period period10Months = Period.of(0,10,0);
		Period period10Days = Period.of(0,0,10);
		
		System.out.println(period5Months.plus(period10Months));
		System.out.println(period10Days.plusDays(35));
		System.out.println(period10Days.plusMonths(5));
		System.out.println(period10Days.plusYears(5));
		
		System.out.println(Period.of(10,5,28).toTotalMonths());
		*/
		
		// ---------- LocalTime
		/*
		LocalTime HourMin = LocalTime.of(23,59);
		LocalTime HourMinSec = LocalTime.of(0,12,6);
		LocalTime HourMinSecNano = LocalTime.of(14,7,10,90289872);
		
		System.out.println(HourMin);
		System.out.println(HourMinSec);
		System.out.println(HourMinSecNano);
		*/
		
		/*
		LocalTime date = LocalTime.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.parse("15:08:23");
		System.out.println(time);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		*/
		
		/*
		LocalTime time = LocalTime.of(16,20,12,98547);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		*/
		
		/*
		LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
		LocalTime paulFinishTime = LocalTime.parse("17:09:12");
		
		System.out.println(shreyaFinishTime.isBefore(paulFinishTime)); // true
		System.out.println(paulFinishTime.isAfter(paulFinishTime)); // false
		*/
		
		/*
		LocalTime movieStartTime = LocalTime.parse("21:00:00");
		
		int commuteMin = 35;
		
		LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
		
		System.out.println("Start by " + shreyaStartTime + " from office");
		*/
		
		/*
		int worldRecord = 10;
		
		LocalTime raceStartTime = LocalTime.of(8,10,55);
		LocalTime raceEndTime = LocalTime.of(8,11,11);
		
		if(raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
				System.out.println("New World Record");
		else
			System.out.println("Try Harder");
		*/
		
		/*
		LocalTime startTime = LocalTime.of(5,7,9);
		if(startTime.getMinute() < 30)
			startTime = startTime.withMinute(0);
		
		System.out.println(startTime);
		*/
		
		/*
		LocalTime time = LocalTime.of(14,10,0);
		LocalDate date = LocalDate.of(2016,02,28);
		
		LocalDateTime dateTime = time.atDate(date);
		System.out.println(dateTime);
		*/
		
		// -------- LocalDate
		/*
		LocalDate date1 = LocalDate.of(2015,12,27);
		LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27);
		
		LocalDate date3 = LocalDate.now();
		
		LocalDate date4 = LocalDate.parse("2025-08-09");
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println();
		*/
		
		/*
		LocalDate date = LocalDate.parse("2021-03-06");
		System.out.println(date.getDayOfMonth()); // 6
		System.out.println(date.getDayOfWeek()); // saturday 
		System.out.println(date.getDayOfYear()); // 65th day of the year
		
		System.out.println(date.getMonthValue()); // 03
		System.out.println(date.getMonth()); // march
		System.out.println(date.getYear()); // 2021
		*/
		
		/*
		LocalDate shreyaBday = LocalDate.parse("2002-08-03");
		LocalDate paulBday = LocalDate.parse("2002-07-29");
		
		System.out.println(shreyaBday.isAfter(paulBday)); // true
		System.out.println(shreyaBday.isBefore(paulBday)); // false
		System.out.println(shreyaBday.isBefore(shreyaBday)); // false
		*/
		
		/*
		LocalDate date = LocalDate.of(2052,03,10);
		
		System.out.println(date.minusDays(10)); // 2052-02-29
		System.out.println(date.minusMonths(2)); // 2052-01-10
		System.out.println(date.minusWeeks(30)); // 
		System.out.println(date.minusYears(1)); //2051-03-10
		*/
		
		/*
		LocalDate date = LocalDate.of(2016,02,29);
		System.out.println(date.plusDays(1)); // 2016-03-01
		System.out.println(date.plusMonths(1)); // 2016-03-29
		System.out.println(date.plusWeeks(7)); // 
		System.out.println(date.plusYears(1)); // 2017-02-28
		*/
		
		/*
		LocalDate date = LocalDate.of(2036,02,28);
		System.out.println(date.withDayOfMonth(1)); // 2036-02-01
		System.out.println(date.withDayOfYear(1)); // 2036-01-01
		System.out.println(date.withMonth(7)); // 2036-07-28
		System.out.println(date.withYear(1)); // 0001-02,28
		*/
		
		/*
		LocalDate interviewDate = LocalDate.of(2016,02,28);
		System.out.println(interviewDate.atTime(0,59));
		System.out.println(interviewDate.atTime(16,30,20));
		System.out.println(interviewDate.atTime(16,30,20,300));
		System.out.println(interviewDate.atTime(LocalTime.of(16,30)));
		*/
		
		/* -- count of days from Jan 1, 1970 to mentionedDate
		LocalDate date = LocalDate.of(1970,1,8);
		System.out.println(date.toEpochDay());
		*/
			
	}
}