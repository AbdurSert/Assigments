package assignment9;

import java.util.Scanner;

public class YasInput {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen dogum tarihinizi giriniz");

		System.out.println("Yil: ");
		int inpt = scn.nextInt();

		String str = String.valueOf(inpt);

		System.out.println("Ay: ");
		int inpt1 = scn.nextInt();

		String str1 = String.valueOf(inpt1);

		System.out.println("Gun: ");
		int inpt2 = scn.nextInt();

		String str2 = String.valueOf(inpt2);

		YasHesap.yasHesap(inpt, inpt1, inpt2);

		YasHesap obj = new YasHesap();

		obj.ay(inpt, inpt1, inpt2);
		obj.gun(str, str1, str2);

	}

}
