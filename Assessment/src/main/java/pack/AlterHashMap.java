package pack;//removing keys from hashmap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author ssadaiyappan - Removing Keys from HashMap
 */
class AlterHashMap {
	private static final Logger log = LogManager.getLogger(AlterHashMap.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("You are into  main()");

		Scanner input = new Scanner(System.in);

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int key;
		String value;
		int size, i;
		System.out.println("give size :");
		size = input.nextInt();
		log.info("hashmap size", size);

		System.out.println("give roll and name for " + size + " students");

		for (i = 0; i < size; i++) {
			key = input.nextInt();
			value = input.next();
			map.put(key, value);
			log.info("key,value", key, value);
		}
		int res = UserMainCode6.sizeOfResultantHashMap(map);
		System.out.println("the result is " + res);
		map.clear();
		input.close();
	}

	public static void print(Map<String, Float> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		} else {
			System.out.println(map);
		}
		System.out.println("Size of map is:- " + map.size());
	}
}

/**
 * 
 * @author ssadaiyappan - removes hash value for 4th multilples
 */
class UserMainCode6 {
	private static final Logger log = LogManager.getLogger(UserMainCode6.class);

	public static int sizeOfResultantHashMap(HashMap<Integer, String> map) {
		log.info("You are into  sizeOfResultantHashMap();parameter-map: ",map);

		HashMap<Integer, String> m2 = new HashMap<Integer, String>();
		try {
			// using for-each loop for iteration over Map.entrySet()
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

				if ((entry.getKey() % 4) == 0) {
					System.out.println("deleted key :" + entry.getKey());
				} else {
					m2.put(entry.getKey(), entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			// res--; java.util.ConcurrentModificationException
			log.info("catch:exception ", e);
		}
		return m2.size();
	}
}