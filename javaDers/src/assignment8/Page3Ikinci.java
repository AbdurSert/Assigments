package assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class Page3Ikinci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen 3 adet rakam giriniz: ");
		int inpt = scn.nextInt();
		int inpt1 = scn.nextInt();
		int inpt2 = scn.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(inpt);
		arr.add(inpt1);
		arr.add(inpt2);

		int toplam = 0;

		for (Integer sayi : arr) {

			toplam += (sayi * sayi);
		}
		System.out.println("\n" + "Girdiginiz sayilarin kareleri toplami: " + toplam);
	}

}
