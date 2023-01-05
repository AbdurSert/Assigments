package assignment9;

public class Ortalama {

	static double ortalama;

	void notOrtalama(int... notlar) {

		for (int each : notlar) {

			ortalama = (((notlar[0] + notlar[1]) / 2) * 0.3);
			ortalama += ((notlar[2]) * 0.5);
			ortalama += (((notlar[3] + notlar[4] + notlar[5]) / 2) * 0.2);

		}

		System.out.println("\n" + "Not ortalamaniz: " + ortalama);

	}
}
