package assignment5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Luttfen bir sayi giriniz: ");
		int inpt = scn.nextInt();

		int bolen = 1;
		int toplam = 0;

		while (bolen <= inpt) {

			if (inpt % bolen == 0) {
				System.out.println(bolen);

				toplam++;

			}

			bolen++;

		}
		System.out.println("\n" + "Toplam bolen sayisi: " + toplam);
	}

}
