package assignment5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen baslangic sayisini griniz: ");
		int inpt = scn.nextInt();

		System.out.println("Lutfen bitis sayisini giriniz: ");
		int inpt1 = scn.nextInt();

		while (inpt <= inpt1) {

			if (inpt % 2 == 0) {

				System.out.print(inpt + ",");
			}

			inpt++;

		}
	}

}
