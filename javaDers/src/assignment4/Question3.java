package assignment4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz: ");
		String inpt = scn.nextLine().trim();

		System.out.println("Lutfen soyisminizi giriniz: ");
		String inpt1 = scn.nextLine().trim();

		int lengthInpt = inpt.length();
		int lengthInpt1 = inpt1.length();

		if (lengthInpt > lengthInpt1) {

			System.out.println("\n" + "Isminiz soyisminizden daha uzun.");

		}

		else if (lengthInpt == lengthInpt1) {

			System.out.println("\n" + "Isminiz ile soysiminizin uzunlugu esit");
		}

		else {

			System.out.println("\n" + "Soyisminiz isminizden daha uzun.");
		}
	}

}
