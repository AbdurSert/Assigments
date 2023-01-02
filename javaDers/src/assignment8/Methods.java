package assignment8;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

	int carp = 1;

	void carpim() {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				carp *= arr[i][j];
			}
		}
		System.out.println("Array icindeki rakamlarin carpimi sonucu: " + carp);
	}

	int carp1 = 1;
	int j = 2;

	void duzensiz() {

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		for (int i = 0; i < arr.length; i++) {

			if (j >= 0) {

				carp1 *= arr[i][j];

			}

			j--;
		}
		System.out.println("Array icindeki son rakanlarin carpimi sonucu: " + carp1);
	}

	int toplam;
	int index;

	void ayniIndex() {

		int[][] arr = { { 1, 2 }, { 3, 4, 5 }, { 6 } };

		int[][] arr1 = { { 7, 8, 9 }, { 10, 11 }, { 12 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				if (i == 2) {

					j = 0;

					toplam = arr[i][j] + arr1[i][j];

					System.out.println((index + 1) + ". sira ayni indexlerin toplami: " + toplam);

					break;
				}

				toplam = arr[i][j] + arr1[i][j];

				++index;

				System.out.println(index + ". sira ayni indexlerin toplami: " + toplam);

			}

			toplam = 0;
		}

	}

	int toplam1;
	int toplam2;
	int toplam3;

	void yeniArray() {

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == 0) {
					toplam1 += arr[0][j];
				}

				else if (i == 1) {
					toplam2 += arr[1][j];
				}

				else {

					toplam3 += arr[2][j];

				}

			}

		}

		int[] arr1 = { toplam1, toplam2, toplam3 };
		System.out.println("Yeni array toplam: " + Arrays.toString(arr1));
	}

	void inpt() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String inpt = scn.nextLine().trim();

		String arr = inpt;
		String arr1 = inpt.replace(" ", "");
		int kelimeSayisi = arr.length() - arr1.length() + (1);

		System.out.println("Toplam kelime sayisi: " + kelimeSayisi);

	}

}
