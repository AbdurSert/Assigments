package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlakaTarama {

	public static void main(String[] args) {

		Ozellikler arac = new Ozellikler("28-XF-ZF", "Ahmet Sert", "07.06.1989", "Mavi", "Mercedes", 2008, 1.5);
		Ozellikler arac1 = new Ozellikler("34-X-KJ", "Mehmet Dertli", "03.05.1991", "Sari", "Audi", 2004, 1.2);
		Ozellikler arac2 = new Ozellikler("54-HJ-M", "Kadir Yol", "21.04.1987", "Kirmizi", "Bmw", 2011, 1.3);
		Ozellikler arac3 = new Ozellikler("17-K-KL", "Selim Yemez", "14.07.1988", "Yesil", "Toyota", 2002, 2.0);
		Ozellikler arac4 = new Ozellikler("46-PN-MF", "Busra Urgat", "23.10.1984", "Siyah", "Honda", 2019, 1.9);
		Ozellikler arac5 = new Ozellikler("13-FM-ZF", "Mahmut Turpcu", "18.03.1999", "Gri", "Seat", 2013, 1.6);
		Ozellikler arac6 = new Ozellikler("88-NG-S", "Ali Sonmez", "11.06.1990", "Mor", "Volvo", 2008, 1.2);
		Ozellikler arac7 = new Ozellikler("44-PK-N", "Ayse Kaya", "15.12.19982", "Gri", "Mercedes", 2007, 1.0);
		Ozellikler arac8 = new Ozellikler("23-HH-K", "Guner Yildiz", "02.02.1994", "Turuncu", "Toyota", 2009, 1.5);
		Ozellikler arac9 = new Ozellikler("65-PY-DS", "Hatice Yildiz", "03.08.1989", "Mavi", "Mercedes", 20016, 2.0);

		List<String> araclar = new ArrayList<String>();

		araclar.add(arac.getPlaka());
		araclar.add(arac1.getPlaka());
		araclar.add(arac2.getPlaka());
		araclar.add(arac3.getPlaka());
		araclar.add(arac4.getPlaka());
		araclar.add(arac5.getPlaka());
		araclar.add(arac6.getPlaka());
		araclar.add(arac7.getPlaka());
		araclar.add(arac8.getPlaka());
		araclar.add(arac9.getPlaka());

		Random pick = new Random();
		int random = pick.nextInt(araclar.size());
		
		String inpt = araclar.get(random);

		for (int i = 0; i <= araclar.size(); i++) {

			if (araclar.get(3).equals(inpt) || araclar.get(5).equals(inpt)) {

				System.out.println(inpt + " Plakali arac calintidir!");

				if (araclar.get(3).equals(inpt)) {

					System.out.println("\n" + "Isim: " + arac3.getIsim() + "\n" + "Dogum Tarihi: " + arac3.getDogum()
							+ "\n" + "Marka: " + arac3.getMarka() + "\n" + "Renk: " + arac3.getRenk() + "\n" + "Model: "
							+ arac3.getModel());
					break;
				}

				else {

					System.out.println("\n" + "Isim: " + arac5.getIsim() + "\n" + "Dogum Tarihi: " + arac5.getDogum()
							+ "\n" + "Marka: " + arac5.getMarka() + "\n" + "Renk: " + arac5.getRenk() + "\n" + "Model: "
							+ arac5.getModel());
					break;
				}
			}

			else {

				System.out.println(inpt + " Plakali aracin kaydi temizdir");
				break;

			}
		}

	}

}
