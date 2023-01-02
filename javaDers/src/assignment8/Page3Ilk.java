package assignment8;

import java.util.Scanner;

public class Page3Ilk {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen 4 adet sayi giriniz: ");

		int[] arr = new int[4];

		arr[0] = scn.nextInt();
		arr[1] = scn.nextInt();
		arr[2] = scn.nextInt();
		arr[3] = scn.nextInt();

		int carpim = 1;

		for (Integer sayi : arr) {

			carpim *= sayi;
		}

		System.out.println(carpim);
	}

}
