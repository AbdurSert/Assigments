package assignment5;

import java.util.Scanner;

public class Question1 {

	public static void gmaildonus(String a) {

		boolean isaret = a.contains("@");
		boolean isaret1 = a.contains("@gmail");
		boolean isaret2 = a.endsWith("@gmail.com");

		if (!isaret) {
			System.out.println("\n" + "Gecersiz e-mail adresi, Tekrar denyiniz.");
		}

		else if (!isaret1) {
			System.out.println("\n" + "Lutfen gmail adresinizi giriniz.");

		}

		else if (!isaret2) {
			System.out.println("\n" + "Yazimda bir sorun var, maili kontrol ediniz.");
		}

		else {
			System.out.println("\n" + "Kaydiniz basariyla alindi.");

		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen e-mail adresinizi gmail olarak giriniz: ");
		String inpt = scn.next();

		gmaildonus(inpt.toLowerCase().trim());

	}

}
