package assignment4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		System.out.println("Lutfen bir sifre belirleyiniz:");
		Scanner scn = new Scanner(System.in);

		String rule = "\n" + "- Ilk Harfi Buyuk Olmali";
		String rule2 = "\n" + "- Son harfi kucuk Olmali";
		String rule3 = "\n" + "- Sifre Bosluk icermemeli";
		String rule4 = "\n" + "- En az 8 karakterli olmali" + "\n";

		System.out.println(rule.concat(rule2).concat(rule3.concat(rule4)));

		String password = scn.nextLine();

		if ((int) password.charAt(0) >= 65 && (int) password.charAt(0) <= 90) {

			if ((int) password.charAt(password.length() - 1) >= 97
					&& (int) password.charAt(password.length() - 1) <= 122) {

				if (!password.contains(" ")) {

					if (password.length() >= 8) {

						System.out.println("\n" + "Sifreniz basariyla olusturulmustur.");

					}

					else {

						System.out.println("\n" + "Sifreniz sartlari saglamiyor");

					}

				}

				else {

					System.out.println("\n" + "Sifreniz sartlari saglamiyor");

				}

			}

			else {

				System.out.println("\n" + "Sifreniz sartlari saglamiyor");
			}

		}

		else {

			System.out.println("\n" + "Sifreniz sartlari saglamiyor");
		}

	}
}
