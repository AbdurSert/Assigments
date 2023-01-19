package assignmen12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen id numaranizi girniz: ");
		int inpt = scn.nextInt();

		Isci check = new Isci();

		UstaBasi check1 = new UstaBasi();
		
		

		if (inpt == check.isci1.getId()) {

			System.out.println("\n Guncel detaylariniz asagidaki gibidir: " + "\n\n " + check.isci1.getIsim()
					+ "\n Zamdan onceki maasiniz: " + check.isci1.getMaas() + "\n Guncel maasiniz: "
					+ check.isci1.getZam());

		}

		else if (inpt == check.isci2.getId()) {

			System.out.println("\n Guncel detaylariniz asagidaki gibidir: " + "\n\n " + check.isci2.getIsim()
					+ "\n Zamdan onceki maasiniz: " + check.isci2.getMaas() + "\n Guncel maasiniz: "
					+ check.isci2.getZam());

		}

		else if (inpt == check1.ustabasi1.getId()) {

			System.out.println("\n Guncel detaylariniz asagidaki gibidir: " + "\n\n " + check1.ustabasi1.getIsim()
					+ "\n Zamdan onceki maasiniz: " + check1.ustabasi1.getMaas() + "\n Guncel maasiniz: "
					+ check1.ustabasi1.getZam());

		}

		else if (inpt == check1.ustabasi2.getId()) {

			System.out.println("\n Guncel detaylariniz asagidaki gibidir: " + "\n\n " + check1.ustabasi2.getIsim()
					+ "\n Zamdan onceki maasiniz: " + check1.ustabasi2.getMaas() + "\n Guncel maasiniz: "
					+ check1.ustabasi2.getZam());

		}

		else {

			System.out.println("\n" + "Gecerli bir id giriniz");
		}

	}

}
