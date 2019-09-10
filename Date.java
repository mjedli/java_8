import java.time.Duration;
import java.time.Instant;


/**
 * @author mjedli
 *
 */
public class Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instant instant1 = Instant.now();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Instant instant2 = Instant.now();
		
		Duration duration = Duration.between(instant1, instant2);
		
		System.out.println(duration.toMillis());
		
		
	}

}
