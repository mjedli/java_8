import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;


/**
 * @author mjedli
 *
 */
public class Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Instant instant1 = Instant.now();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		
		Instant instant2 = Instant.now();
		
		Duration duration = Duration.between(instant1, instant2);
		
		System.out.println(duration.toMillis());

		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		
		LocalDate now1 = LocalDate.of(1900, Month.DECEMBER, 2);
		
		System.out.println(now1);
		
		System.out.println(now1.until(now).getYears() + "years");
		
	}

}
