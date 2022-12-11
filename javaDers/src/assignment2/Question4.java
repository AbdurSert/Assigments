package assignment2;

import java.util.Scanner;

public class Question4 {

	public static void convert(double mile) {

		double km = mile * 1.6;
		System.out.println("\nSonuc: " + km + " km");

	}

	public static void main(String[] args) {

		System.out.println("MILE to KM" + "\n");
		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen mile degerini giriniz: ");

		double inpt = scn.nextDouble();

		convert(inpt);

	}

}
