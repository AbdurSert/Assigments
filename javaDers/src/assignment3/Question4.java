package assignment3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz: ");
		String inpt = scn.nextLine();

		switch (inpt) {

		case "cuma":
			System.out.println("\n" + "Muslumanlar icin kutsal gun");
			break;

		case "cumartesi":
			System.out.println("\n" + "Yahudiler icin kutsal gun");
			break;

		case "pazar":
			System.out.println("\n" + "Hristiyanlar icin kutsal gun");
			break;

		default:
			System.out.println("\n" + "Herhangi bir kutsal gun girmediniz");

		}

	}

}
