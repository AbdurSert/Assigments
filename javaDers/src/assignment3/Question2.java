package assignment3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz: ");

		String inpt1 = scn.nextLine();

		String sonuc = inpt1.equals("cumartesi") ? "Bugun haftasonu ve cumartesi"
				: inpt1.equals("pazar") ? "Bugun pazar ve haftasonu" : "Bugun hafata ici";

		System.out.println(sonuc);

	}
}
