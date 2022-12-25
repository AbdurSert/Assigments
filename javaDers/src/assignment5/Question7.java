package assignment5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen pozitif sayilar giriniz ve \"0\" a basiniz. ");
		int sayi = 0;
		int toplam = 0;

		do {

			int inpt = scn.nextInt();

			if (inpt == 0) {
				break;

			}
			if (inpt > 0) {

				toplam += inpt;

				sayi++;

			}

		}

		while (true);

		System.out.println("\n" + "Toplam pozitif sayi: " + sayi);
		System.out.println("\n" + "Sayilarin toplami: " + toplam);
	}

}
