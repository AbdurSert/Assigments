package assignment9;

import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class StringBuild {

	public static void main(String[] args) {

		LocalTime ilkZaman = LocalTime.now();

		Scanner scn = new Scanner(System.in);

		System.out.println("Lutfen adinizi girniz: ");
		String ad = scn.nextLine();

		System.out.println("Lutfen soyadinizi giriniz: ");
		String soyad = scn.nextLine();

		System.out.println("\n" + "Hosgeldiniz " + ad + " " + soyad);

		System.out.println("\n" + "Lutfen 11 haneli TC kimlik numaranizi giriniz: ");

		StringBuilder tcNum = new StringBuilder();

		tcNum.append(scn.nextLine());

		tcNum.replace(1, 3, "**").replace(4, 8, "****").replace(9, 11, "**");

		StringBuilder kartNum = new StringBuilder();

		System.out.println("\n" + "TC kimlik numaraniz: " + tcNum + "\n"
				+ "Onayliyorsaniz lutfen 16 haneli Kredi kart numaranizi giriniz: ");

		kartNum.append(scn.nextLine());

		kartNum.insert(4, " ").insert(9, " ").insert(14, " ");
		kartNum.replace(0, 4, "****").replace(5, 9, "****").replace(10, 14, "****");

		System.out.println("\n" + "Kart numaraniz: " + kartNum);

		LocalTime sonZaman = LocalTime.now();

		int hour = sonZaman.getHour() - ilkZaman.getHour();
		int minute = sonZaman.getMinute() - ilkZaman.getMinute();
		int second = sonZaman.getSecond() - ilkZaman.getSecond();

		System.out.println(
				"\n" + "isleminiz: " + hour + " saat " + minute + " dakika " + second + " saniyede tamamlanmistir");

	}

}
