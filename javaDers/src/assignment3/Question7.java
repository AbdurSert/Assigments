package assignment3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz: ");
		int inpt = scn.nextInt();

		if (inpt > 9999 || inpt < 1000) {
			System.out.println("\n" + "Gecerli bir sayi giriniz");
		}

		else {

			String sonuc = inpt % 5 == 0
					? inpt % 10 == 5 ? "\n" + "Girdiginiz sayi son rakami \" 5 \" olan bir tek sayi"
							: "\n" + "Girdiginiz sayi son rakami \" 0 \" olan bir cift sayi"
					: "\n" + "Girdiginiz sayi \" 5 \" e bolunemeyen bir sayi";
			System.out.println(sonuc);

		}
	}

}
