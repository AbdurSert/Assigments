package assignment3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Bir harf giriniz p/s/c: ");
		String inpt1 = scn.next();

		switch (inpt1) {

		case "p":
			System.out.println("PAzar, Pazartesi, Persembe");

			break;

		case "c":
			System.out.println("Carsamba, Cuma, Cumartesi");

			break;

		case "s":
			System.out.println("Sali");

			break;

		default:
			System.out.println("Haftanin gunlerinde input yaptiginiz harf ile baslayan gun yoktur");

		}

	}

}
