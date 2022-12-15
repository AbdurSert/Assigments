package assignment3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz: ");
		char inpt = scn.next().charAt(0);

		if ((int) inpt >= 65 && (int) inpt <= 90 || (int) inpt >= 97 && (int) inpt <= 122) {

			System.out.println("\n" + "Girdiginiz karakter bir harf");
		}

		else {
			System.out.println("\n" + "Girdiginiz karakter bir harf degil");
		}

	}

}
