package assignment2;

import java.util.Scanner;

public class Question5 {

	public static void hoursToSeconds(long hours) {

		long seconds = hours * 3600;
		System.out.println("\nSonuc: " + seconds + " seconds");

	}

	public static void main(String[] args) {

		System.out.println("HOURS to SECONDS" + "\n");

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen saat miktarini giriniz: ");
		long inpt = scn.nextLong();

		hoursToSeconds(inpt);

	}

}
