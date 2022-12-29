package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Urunler {

	static int k = 0;
	static String tumUrunler[] = new String[5];

	String[] urunler(String urun) {

		tumUrunler[k] = urun;

		return tumUrunler;

	}

	static void degisklik() {

		while (true) {

			Scanner scn = new Scanner(System.in);

			System.out.println("*Eger listede degistirmek istediginiz bir urun varsa \"ekle\", "
					+ "degisiklik yapmak istemiyorsaniz \"ekleme\" yaziniz ");
			String inpt1 = scn.nextLine().toLowerCase();

			if (inpt1.equals("ekleme")) {

				System.out.println("\n" + "Guncel Listeniz: " + "\n" + Arrays.toString(tumUrunler));
				break;
			}

			else if (inpt1.equals("ekle")) {

				System.out.println("\n" + "Urunun numarasi[0-5]: ");
				int inpt2 = scn.nextInt();

				Scanner scn1 = new Scanner(System.in);

				System.out.println("\n" + "Eklemek istediginiz urun: ");
				String inpt3 = scn1.nextLine();

				tumUrunler[inpt2 - 1] = inpt3;

				System.out.println("\n" + "Urun basariyla degistirildi, Guncel Listeniz: ");
				System.out.println("\n" + Arrays.toString(tumUrunler));
				break;

			}

			else {

				System.out.println("\n" + "Gecerli bir komut giriniz." + "\n");

			}
		}

	}

}
