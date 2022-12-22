package assignment5;

import java.util.Scanner;

public class Question3 {

	public static int uslusayi(int a, int b) {

		double sonuc = Math.pow(a, b);
		System.out.println("\n" + "Sonuc: " + (int) sonuc);

		return (int) sonuc;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir ilk once taban sayisini giriniz: ");
		int sayi = scn.nextInt();
		System.out.println("\n" + "Lutfen us sayisini giriniz: ");
		int sayi1 = scn.nextInt();

		uslusayi(sayi, sayi1);

	}

}
