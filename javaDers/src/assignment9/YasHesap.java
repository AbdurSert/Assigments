package assignment9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class YasHesap {

	static void yasHesap(int tarih, int ay, int gun) {

		LocalDate date = LocalDate.now();

		LocalDate kullanici = LocalDate.of(tarih, ay, gun);

		Period yas = Period.between(date, kullanici);

		StringBuilder str = new StringBuilder();

		String sonYas = yas.toString();

		str.append(sonYas);

		System.out.println(str.length());

		System.out.println("\n" + str.subSequence(2, str.length()) + " Yasindasiniz");

	}

	void ay(int tarih, int ay, int gun) {

		LocalDate date = LocalDate.now();

		LocalDate kullanici = LocalDate.of(tarih, ay, gun);

		Period yas = Period.between(kullanici, date);

		System.out.println("\n" + "Ay bazinda " + yas.toString().substring(4, 6) + " yasindasiniz");

	}

	String gun(String tarih1, String ay1, String gun1) {

		int tarih = Integer.valueOf(tarih1);
		int ay = Integer.valueOf(ay1);
		int gun = Integer.valueOf(gun1);

		LocalDate date = LocalDate.now();

		LocalDate kullanici = LocalDate.of(tarih, ay, gun);

		Period yas = Period.between(kullanici, date);

		System.out.println("\n" + "Gun bazinda " + yas.toString().substring(6) + " yasindasiniz");

		return yas.toString();

	}

}
