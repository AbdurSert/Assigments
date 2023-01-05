package assignment9;

import java.util.Scanner;

public class VeriGiris {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Lutfen kalkis tarihini giriniz");
		System.out.print("\n" + "Yil: ");
		int a = scn.nextInt();
		System.out.print("\n" + "AY: ");
		int b = scn.nextInt();	
		System.out.print("\n" + "Gun: ");
		int c = scn.nextInt();
		
		System.out.println("\n" + "Lutfen saati giriniz");
		System.out.print("\n" + "Saat: ");
		int s = scn.nextInt();
		System.out.print("\n" + "Dakika: ");
		int d = scn.nextInt();
		
		Sonuc.compare(a, b, c, s, d);
		
	}

}
