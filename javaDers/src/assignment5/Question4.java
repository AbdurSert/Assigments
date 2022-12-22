package assignment5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");
		int inpt = scn.nextInt();

		for (; inpt >= -99999 && inpt < -10000 || inpt < 100000 && inpt >= 9999;) {

			int sonuc = inpt % 10 + (inpt / 10) % 10 + (inpt / 100) % 10 + (inpt / 1000) % 10 + (inpt / 10000) % 10;
			System.out.println("Rakamlar toplami: " + sonuc);
			break;

		}

	}

}
