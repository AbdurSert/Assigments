package assignment4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz: ");

		String inpt = scn.nextLine();
		String inpt1 = inpt.toLowerCase();

		if (inpt1.contains("z") && inpt1.contains("a")) {

			System.out.println("\n" + "Girdiginiz isim \"a\" ve \"z\" harfi icermektedir");

		}

		else if (inpt1.contains("a")) {

			System.out.println("\n" + "Girdiginiz isim \"a\" harfi icermektedir.");

		}

		else if (inpt1.contains("z")) {

			System.out.println("\n" + "\"Girdiginiz isim \"z\" harfi icermektedir.\"");

		}

		else {
			System.out.println("\n" + "Girdiginiz isim \"a\" veya \"z\" harfi icermemektedir.");
		}

	}

}
