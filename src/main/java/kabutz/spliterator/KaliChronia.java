package kabutz.spliterator;

import java.time.*;
import java.util.stream.*;
public class KaliChronia {
	
	public static void main(String... args) {
		Stream<LocalDate> newYearDays = StreamSupport.stream(
				new kabutz.spliterator.YearSpliterator( LocalDate.of(2018, Month.JANUARY, 1))
				, false);
    
		newYearDays
        	.filter(day -> day.getDayOfWeek() == DayOfWeek.MONDAY)
        	.takeWhile(day -> day.getYear() >= 1900)
        	.forEach(System.out::println);

		System.out.println("Done!");
	}
	
}
