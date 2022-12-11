package assignment2;

import java.util.Scanner;

public class Question6 {

	public static void cevre(double a) {

		double kareCevre = a * 4;
		System.out.println("\nGirdiginiz kerenin cevresi: " + kareCevre + " cmdir");

	}

	public static void hacim(double b) {

		double kareHacim = (Math.pow(b, 3));
		System.out.println("\n" + "Girdiginiz karenin hacmi: " + kareHacim + " cmkuptur");

	}

	public static void alan(double c) {

		double kareAlan = (Math.pow(c, 2));
		System.out.println("\n" + "Girdiginiz karenin alani: " + kareAlan + " cmkaredir");

	}

	public static void main(String[] args) {

		System.out.println("KARE CEVRE HESAPLAMA");

		Scanner scn = new Scanner(System.in);
		System.out.println(
				"\n" + "Lutfen cevresini hesaplamak istediginiz karenin bir kenar uzunlugunu 'cm' olarak giriniz: ");
		double inpt = scn.nextInt();

		cevre(inpt);

		System.out.println("\n" + "KARE HACIM HESAPLAMA");

		System.out.println(
				"\n" + "Lutfen hacmini ogrenmek istediginiz karenin bir kenar uzunlugunu 'cm' olarak giriniz: ");
		double inpt2 = scn.nextDouble();

		hacim(inpt2);

		System.out.println("\n" + "KARE ALAN HESAPLAMA");

		System.out.println(
				"\n" + "Luttfen alanini ogrenmek istediginiz karenin bir kenar uzunlugunu 'cm' olarak giriniz:  ");
		double inpt3 = scn.nextDouble();

		alan(inpt3);

	}

}
