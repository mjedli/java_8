/**
 * 
 */
package java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author mjedli
 *
 */
public class ListJava8 {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		
		// foreach
		
		List<String> list = Arrays.asList("e1", "e2", "e3");

		list.forEach(System.out::print); // e1e2e3
		
		// removeif
		
		List<String> collection = Arrays.asList("e1", "e2", "e3");
		
		collection = Arrays.asList("e1", "e2" , "e4" , "e3");
		
		boolean r = collection.removeIf(s -> s.length() > 2);
		
		System.out.println(r); // false
		
		collection.forEach(System.out::print);
		
		// replaceAll
		
		UnaryOperator<String> operator = s->s.toUpperCase();
		collection.replaceAll(operator);
		
		System.out.println(collection); // [E1, E2, E4, E3]
		
		// sort
		
		 Comparator<String> cmp = new Comparator<String>() {
			 public int compare(String obj1, String obj2) {
				    if (obj1 == obj2) {
				        return 0;
				    }
				    if (obj1 == null) {
				        return -1;
				    }
				    if (obj2 == null) {
				        return 1;
				    }
				    return obj1.compareTo(obj2);
			}
		};
		collection.sort(cmp);
		System.out.println(collection); // [E1, E2, E3, E4]
		
		
		// stream filter
		
		String result = collection.stream().filter(e -> "E2".equals(e)).findAny().orElse("");
		
		System.out.println(result); // E2
		
		
		String result1 = collection.stream().filter(e -> "E0".equals(e)).findAny().orElse("not found");
		
		System.out.println(result1); // not found
	}

}
