/**
 * 
 */
package java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author mjedli
 *
 */
public class ComparatorJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// naturalOrder
		
		Comparator.naturalOrder();
		
		List<String> collection = Arrays.asList("e2", "e3", "e1");

		System.out.println(collection); //[e2, e3, e1]
		
		collection.sort(Comparator.naturalOrder());
		
		System.out.println(collection); //[e1, e2, e3]
		
		// comparingby
		
		Product p1 = new Product();
		p1.setNumber(2);
		p1.setType("E1");
		
		Product p2 = new Product();
		p2.setNumber(1);
		p2.setType("E2");

		Product[] p = new Product[] {p1, p2};
		
		System.out.println(p[0].getNumber() + " - " + p[1].getNumber()); // 2 - 1
		
		Comparator<Product> comp = Comparator.comparing(Product::getNumber); 
		
		Arrays.sort(p, comp);
		
		System.out.println(p[0].getNumber() + " - " + p[1].getNumber()); // 1 - 2
		
		Comparator<Product> comp1 = Comparator.comparing(Product::getNumber).thenComparing(Product::getType); 
		
		Arrays.sort(p, comp1);
		
		System.out.println(p[0].getNumber() + " - " + p[1].getNumber()); // 1 - 2
	}

}


