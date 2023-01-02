package assignment8;

import java.util.Arrays;

public class Page3Son {

	public static void main(String[] args) {
		
		String yazi = "Bugun havalar cok guzel";
		
		String[] arr = yazi.replace(" ", "").split("");
		
	
		int karakterSayisi = arr.length; 
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n" + "Toplam karakter sayisi: "+ karakterSayisi);
		
	

	}

}
