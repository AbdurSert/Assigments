package assignment2;

import java.util.Scanner;

public class Question7 {

	public static void prizmaHacim(int a, int b, int c) {

		int prizmaHacim = a * b * c;
		System.out.println("\n" + "Girdigniz dikdortgenler prizmasinin hacmi: " + prizmaHacim + " cmkuptur");
	}

	public static void main(String[] args) {

		System.out.println("PRIZMA HACIM HESAPLAMA");

		Scanner scn = new Scanner(System.in);
		System.out.println("\n" + "Hacmini ogrenmek istediginiz dikdortgenler prizmasinin uzun kenari(cm): ");
		int inpt1 = scn.nextInt();

		System.out.println("\n" + "Hacmini ogrenmek istediginiz dikdortgenler prizmasinin kisa kenari(cm): ");
		int inpt2 = scn.nextInt();

		System.out.println("\n" + "Hacmini ogrenmek istediginiz dikdortgenler prizmasinin yuksekligi(cm): ");
		int inpt3 = scn.nextInt();

		prizmaHacim(inpt1, inpt2, inpt3);

	}

}
