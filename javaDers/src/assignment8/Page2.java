package assignment8;

import java.util.ArrayList;
import java.util.Collections;

public class Page2 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("A");
		arr.add("C");
		arr.add("E");
		arr.add("F");
		arr.add("B");

		System.out.println(arr);

		arr.add(1, "L");

		System.out.println(arr);

		arr.set(3, "D");

		System.out.println(arr);

		arr.remove(4);

		System.out.println(arr);

		Collections.sort(arr);

		System.out.println(arr);

		System.out.println(arr.size());

		arr.clear();

		System.out.println(arr);
		System.out.println(arr.isEmpty());

	}

}
