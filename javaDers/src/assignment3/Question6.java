package assignment3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz(0-100): ");
		int inpt = scn.nextInt();

		if (inpt > 80 && inpt <= 100) {

			System.out.println("\n" + "Notunuz: \" A \" ");

		}

		else if (inpt >= 60 && inpt <= 80) {

			System.out.println("\n" + "Notunuz: \" B \" ");

		}

		else if (inpt >= 50 && inpt <= 60) {

			System.out.println("\n" + "Notunuz: \" C \" ");

		}
		
		else if(inpt < 50 && inpt >= 0 ) {
			
			System.out.println("\n" + "Notunuz: \" D \" ");
			
		}
		
		else {

			System.out.println("\n" + "Gecerli bir sayi girmediniz");
		}

	}

}
