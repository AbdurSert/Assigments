package assignment13;

import java.util.Scanner;

public class TryCatch {

	String tc;

	void tcKimlik() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen tc kimlik numaranizi giriniz: ");
		tc = scn.nextLine().trim();

		boolean icerik = tc.codePointAt(tc.codePointCount(0, tc.length() - 1)) > 47
				&& tc.codePointAt(tc.codePointCount(0, tc.length() - 1)) < 58;

		if (tc.length() > 11) {

			try {

				throw new IndexOutOfBoundsException();

			} catch (IndexOutOfBoundsException e) {

				System.out.println("\n" + "Girmis oldugunuz Tc kimlik numarasi 11 haneli degil");

			}

		}

		else if (icerik == false) {

			try {

				throw new IllegalArgumentException();

			}

			catch (IllegalArgumentException e) {

				System.out.println("\n" + "Girdiginiz tc tamamen rakam icermelidir");
			}

		}

		else {
			System.out.println("\n" + "Tc' niz alinmstir");

		}
	}

	void tcKimlikCheck() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen tc kimlik numaranizi giriniz: ");
		String tc1 = scn.nextLine().trim();

		String sonRakam = String.valueOf(tc1.charAt(tc1.length() - 1));
		int tcCift = Integer.valueOf(sonRakam);

		try {
			if (tc1.length() > 11) {

				throw new IndexOutOfBoundsException();
			}

			try {

				if (tcCift % 2 != 0) {
					throw new IllegalArgumentException();

				}

			}

			catch (IllegalArgumentException e) {

				System.out.println("Girdiginiz Tc nin son rakami cift olmali");

			}
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("\n" + "Girmis oldugunuz Tc kimlik numarasi 11 haneli degil");
		}

		finally {

			scn.close();

		}
	}

}
