package assignment15;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCl {

	public static void main(String[] args) {

		LinkedList<String> lnk = new LinkedList<>();

		lnk.add("ALI");
		lnk.add("VELI");
		lnk.add("CAN");
		lnk.add("AYSE");

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz: ");
		String inpt = scn.nextLine().trim().toUpperCase();

		if (lnk.contains(inpt)) {

			lnk.removeFirstOccurrence(inpt);

			System.out.println("\n" + "Girdiginiz isim listede mevcuttu ve silindi, guncel liste: " + "\n" + lnk);

		}

		else {
			System.out.println(
					"\n" + "Girdginiz isim listede mevut degil o yuzden silinemdi, guncel liste: " + "\n" + lnk);

		}
	}

}
