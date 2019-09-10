package java_8;
import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * @author mjedli
 *
 */
public class StringJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Stream

		String hello = "hello!";
		
		IntStream stream = hello.chars();
		
		stream.forEach(System.out::println);

		// StringJoiner
		
		StringJoiner sj = new StringJoiner(":").add("20").add("22");
		System.out.println(sj.toString()); // 20:22
		
		StringJoiner sj1 = new StringJoiner(":", "[" , "]").add("20").add("22");
		System.out.println(sj1.toString()); // [20:22]
		
		String s = String.join(":", "20", "22");
		System.out.println(s); // 20:22
		
		String [] tab = {"20", "22"};
		String out = String.join(":", tab);
		System.out.println(out); // 20:22
	}

}
