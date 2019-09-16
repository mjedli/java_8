/**
 * 
 */
package java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.counting;

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
		
		// collect
		
		Set<String> result3 = collection.stream().collect(toSet());
		
		System.out.println(result3); //[E1, E2, E3, E4]
		
		Long result4 = collection.stream().collect(counting());
		
		System.out.println(result4); // 4
		
		// map
		
		Product p1 = new Product();
		p1.setNumber(2);
		p1.setType("E1");
		
		Product p2 = new Product();
		p2.setNumber(1);
		p2.setType("E2");
		
		List<Product> l = Arrays.asList(p1 , p2);
		
		Set<String> result5 = l.stream().filter(e -> "E2".equals(e.getType())).map(Product::getType).collect(toSet());
		
		System.out.println(result5); // [E2]
		
	}

}
