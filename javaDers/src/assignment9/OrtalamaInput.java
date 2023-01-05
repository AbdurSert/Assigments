package assignment9;

import java.util.Scanner;

public class OrtalamaInput {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen 1.vize notunu giriniz: ");
		int vize1 = scn.nextInt();

		System.out.println("Lutfen 2.vize notunu giriniz: ");
		int vize2 = scn.nextInt();

		System.out.println("Lutfen final notunu giriniz: ");
		int finalNot = scn.nextInt();

		System.out.println("Lutfen 1.sozlu notunu giriniz: ");
		int sozlu1 = scn.nextInt();
		System.out.println("Lutfen 2.sozlu notunu giriniz: ");
		int sozlu2 = scn.nextInt();

		System.out.println("Lutfen 3.sozlu notunu giriniz: ");
		int sozlu3 = scn.nextInt();

		Ortalama obj = new Ortalama();

		obj.notOrtalama(vize1, vize2, finalNot, sozlu1, sozlu2, sozlu3);

	}

}
