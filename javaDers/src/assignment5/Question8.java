package assignment5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int toplam = 0;
		int girilenSayi = 1;

		do {

			System.out.println("Lutfen toplami en az 500 olacak sekilde sayilar giriniz: ");
			int inpt = scn.nextInt();

			toplam += inpt;

			if (toplam >= 500) {
				break;

			}

			girilenSayi++;

		} while (true);

		System.out.println("\n" + "Girilen sayilarin toplami: " + toplam);
		System.out.println("\n" + "Toplam girilen sayi: " + girilenSayi);
	}
}
