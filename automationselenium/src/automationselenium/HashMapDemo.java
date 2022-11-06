package automationselenium;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		// HashMap<Integer,String>m =new HashMap<Integer,String>();

		// add key value pair
		hm.put(101, "Gibi");
		hm.put(102, "kibi");
		hm.put(103, "libi");
		hm.put(104, "hibi");
		hm.put(105, "tibi");
		hm.put(101, "Gi");// old value replaced with new value

		System.out.println(hm);

		// get value from hashmap
		hm.get(105);
		System.out.println(hm.get(105));// ans tibi

		// remove value from hashmap
		hm.remove(105);
		System.out.println(hm);// removed pair 105 tibi

		hm.containsKey(104);
		System.out.println(hm.containsKey(104));// returns true

		hm.containsKey(105);
		System.out.println(hm.containsKey(105));// returns false as it is removed earlier

		hm.containsValue("hibi");// check whether the value is there and returns boolean value
		System.out.println(hm.containsValue("hibi"));

		System.out.println(hm.isEmpty());// returns false as it contains value

		System.out.println(hm.keySet());// returns all the keys as set no duplicates allowed[101,102,]

		// print each keys as individual using for each loop

		for (Object i : hm.keySet()) {
			System.out.println(i);

		}

		System.out.println(hm.values());// returns all the values as a collection

		hm.entrySet();
		
		for(Object j:hm.values()) {
			System.out.println(j);
		}
		System.out.println(hm.entrySet());// get all the entries as set

	}

}
