/**
 * 
 */
package java_8;

import java.util.HashMap;

/**
 * @author mjedli
 *
 */
public class MapJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// foreach
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("k1", "value1");
		map.put("k2", "value2");
		
		map.forEach((key, value)->System.out.print(key + " - " + value + " ")); //k1 - value1 k2 - value2
		
		// replace
		map.replace("k1", "value3");
		map.forEach((key, value)->System.out.print(key + " - " + value + " ")); //k1 - value3 k2 - value2
		
		map.replace("k1", "value3", "value22");
		map.forEach((key, value)->System.out.print(key + " - " + value + " ")); //k1 - value22 k2 - value2 
		
		// replaceall
		
		map.replaceAll((key, value) ->  value + "8");
		map.forEach((key, value)->System.out.print(key + " - " + value + " ")); //  k1 - value228 k2 - value28 
		
		// remove
		map.remove("k1", "value228");
		map.forEach((key, value)->System.out.print(key + " - " + value + " ")); // k2 - value28 
	}

}
