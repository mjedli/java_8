package java_8;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


/**
 * @author mjedli
 *
 */
public class DateJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Instant - Duration
		
		Instant instant1 = Instant.now();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		
		Instant instant2 = Instant.now();
		
		Duration duration = Duration.between(instant1, instant2);
		
		System.out.println(duration.toMillis()); //500

		// LocalDate
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now); //2019-09-10
		
		LocalDate now1 = LocalDate.of(1900, Month.DECEMBER, 2);
		
		System.out.println(now1); //1900-12-02
		
		System.out.println(now1.until(now).getYears() + "years"); // 118years
		
		// LocalTime
		
		LocalTime time = LocalTime.now();
		
		System.out.println(LocalTime.of(2, 4)); //02:04 
		
		System.out.println(LocalTime.of(2, 4).plusHours(2)); //04:04
		
		// ZoneTime
		
		System.out.println(ZoneId.getAvailableZoneIds());
		System.out.println(ZoneId.of("Etc/GMT+8"));
		
		ZonedDateTime current = ZonedDateTime.of(LocalDate.of(2000, Month.APRIL, 2), LocalTime.of(2,20), ZoneId.of("Etc/GMT+8"));
		System.out.println(current); // 2000-04-02T02:20:00-08:00[Etc/GMT+8]
		
		// DateTime Formatter
		System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(current)); // 2000-04-02T02:20:00-08:00[Etc/GMT+8]
	}

}
