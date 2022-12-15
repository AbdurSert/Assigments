package assignment3;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int sayi1 = scn.nextInt();

		System.out.println("Ikinci sayiyi giriniz: ");
		int sayi2 = scn.nextInt();

		System.out.println("Ucuncu sayiyi giriniz: ");
		int sayi3 = scn.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {

			System.out.println("Giridiginiz sayilar arasindan en buyugu: " + sayi1);

		}

		else if (sayi2 > sayi1 && sayi2 > sayi3) {

			System.out.println("\"Giridiginiz sayilar arasindan en buyugu: " + sayi2);
		}

		else {
			System.out.println("Giridiginiz sayilar arasindan en buyugu: " + sayi3);
		}

	}

}
