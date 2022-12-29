package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		System.out.println("Tebrikler! Ucretsiz almaya hak kazandiginiz 5 urunu giriniz lutfen: ");
		Scanner scn = new Scanner(System.in);

		Urunler obj = new Urunler();

		int i = 0;

		while (i <= 4) {

			System.out.println("\n" + (i + 1) + ".Urun: ");
			String inpt = scn.nextLine();

			obj.urunler(inpt);

			i++;
			obj.k++;
		}

		Arrays.sort(obj.tumUrunler);
		System.out.println("\n" + "Girdiginiz urunler: " + Arrays.toString(obj.tumUrunler));

		obj.degisklik();

	}

}
