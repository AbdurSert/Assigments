package assignment15;

import java.util.Scanner;

public class MainCl {

	public static void main(String[] args) {

		Otomobil oto1 = new Otomobil();
		Otomobil oto2 = new Otomobil();
		Otomobil oto3 = new Otomobil();

		Scanner scn = new Scanner(System.in);

		System.out.println("Otomobiliniz elektrik motorlu mu yoksa hybride motorlu mu olsun?  "
				+ " Elektrikli icin \"1\" benzinli icin \"2\" yaziniz ");
		oto1.motorTipi(scn.nextInt());

		System.out.println("\n" + "Otomobiliniz otomatik vitesli mi yoksa duz vitesli mi olsun?"
				+ " Otomatik icin \"1\" duz icin \"2\" yaziniz ");
		oto1.vitesTipi(scn.nextInt());

		System.out.println(
				"\n" + "Otomobiliniz sedan mi  yoksa spor olsun?" + " Sedan icin \"1\" spor icin \"2\" yaziniz ");
		oto1.aracTipi(scn.nextInt());

		System.out.println("\n" + "Otomobilinizde sunroof olsun mu?" + " Evet icin \"1\" hayir icin \"2\" yaziniz ");
		oto1.sunRoof(scn.nextInt());

		System.out.println("\n" + "Otomobilinizde metalik renk olsun mu?" + " Evet icin \"1\" hayir icin \"2\" yaziniz ");
		oto1.metalikRenk(scn.nextInt());

		System.out.println("\n" + "Otomobilinizde bodykit olsun mu?" + " Evet icin \"1\" hayir icin \"2\" yaziniz ");
		oto1.bodyKit(scn.nextInt());

		System.out.println("\n" + "Otomobilinizde celik jant olsun mu?" + " Evet icin \"1\" hayir icin \"2\" yaziniz ");
		oto1.celikJant(scn.nextInt());

		System.out.println("\n" + "Otomobilinizde multimedia olsun mu?" + " Evet icin \"1\" hayir icin \"2\" yaziniz ");
		oto1.multiMedia(scn.nextInt());

		System.out.println(oto1.toString());

	}

}
