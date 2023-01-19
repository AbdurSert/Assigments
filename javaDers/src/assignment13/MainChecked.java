package assignment13;

import java.util.Scanner;

public class MainChecked {

	public void loginChecked() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bosluk icermeyen bir sifre yaziniz: ");
		String parola = scn.nextLine();

		if (parola.contains(" ")) {

			try {
				throw new UncheckedExc();
			}

			catch (UncheckedExc e) {
				System.out.println("Lutfen bosluk icermeyen bir parola giriniz");
				e.printStackTrace();
			}

			finally {
				scn.close();
			}

		}

		else {

			System.out.println("Parolaniz alinmistir");
		}

	}

	public void loginChecked1() throws LackOfRequestException {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen bosluk icermeyen bir sifre yaziniz: ");
		String parola1 = scn.nextLine();

		if (parola1.contains(" ")) {

			throw new LackOfRequestException(" Sifreniz hatali");
		}

		else {
			System.out.println("Sifrerniz olusturuldu");

		}
	}

}
