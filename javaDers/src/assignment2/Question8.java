package assignment2;

import java.util.Scanner;

public class Question8 {

	public static void kisielBilgi(String name, String surname) {

		System.out.println("\n" + "Isim: " + name + "\n" + "Soyisim: " + surname + "\n"
				+ "Kursa Kaydiniz Basariyla Alinmistir, Teekkurler.");

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Lutfen adinizi giriniz: ");
		String inpt1 = scn.next();

		System.out.println("\n" + "Lutfen soy adinizi giriniz: ");
		String inpt2 = scn.next();

		kisielBilgi(inpt1, inpt2);

	}

}
