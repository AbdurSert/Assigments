package assignment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Ad: ");
		String inpt = scn.nextLine().trim();

		System.out.println("Soyad: ");
		String inpt1 = scn.nextLine().trim();

		System.out.println("Kart numarasi: ");
		String inpt2 = scn.nextLine().trim();

		if (inpt.isBlank() || inpt1.isBlank() || inpt2.isBlank()) {

			System.out.println("\n" + "Bu alanlardan herhangi biri bos birakilamaz.");

		}

		else {

			String inptName = inpt.substring(1).replaceAll("\\w", "*");
			String inptName2 = inpt.charAt(0) + inptName;

			String inptSurname = inpt1.substring(1).replaceAll("\\w", "*");
			String inptSurname2 = inpt1.charAt(0) + inptSurname;

			String cardNumber = inpt2.substring(0, inpt2.length() - 4).replaceAll("\\d", "*");
			String cardNumber2 = inpt2.substring(inpt2.length() - 4, inpt2.length());

			System.out.println("\n" + inptName2 + " " + inptSurname2);
			System.out.println("\n" + cardNumber + cardNumber2);
		}
	}

}
