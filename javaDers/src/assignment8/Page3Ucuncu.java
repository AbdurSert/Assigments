package assignment8;

import java.util.Arrays;
import java.util.Collections;

public class Page3Ucuncu {

	public static void main(String[] args) {

		String[] arr = { "A", "D", "F", "G", "E" };
		String[] arr1 = { "D", "C", "F", "A", "H" };

		for (String harf : arr) {

			for (int i = 0; i < arr1.length; i++) {

				if (arr1[i].equals(harf)) {
					System.out.print(harf);
				} 

			}
		}

	}

}
