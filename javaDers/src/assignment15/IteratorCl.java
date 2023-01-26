package assignment15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class IteratorCl {

	public static void main(String[] args) {

		List<Integer> sayilar = new ArrayList<>();

		Random rnd = new Random();

		for (int i = 0; i <= 10; i++) {

			sayilar.add(rnd.nextInt(1, 100));
		}

		System.out.println(sayilar);

		Iterator<Integer> iter = sayilar.iterator();

		int i = 0;
		while (i < 3) {

			iter.next();
			iter.remove();
			
			i++;
		}

		System.out.println(sayilar);

	}

}
