package assignment5;

public class Question2 {

	public static void sayim(String dizi) {

		int harfSayisi = (dizi.indexOf("y") + 1) - (dizi.indexOf("I"));
		int rakamSayisi = (dizi.indexOf("4") + 1) - (dizi.indexOf("1"));
		int karakterSayisi = (dizi.indexOf("+") + 1) - (dizi.indexOf("."));

		System.out.println("Toplam harf sayisi: " + harfSayisi + "\n" + "Toplam rakam sayisi: " + rakamSayisi + "\n"
				+ "Toplam karakter sayisi: " + karakterSayisi);

	}

	public static void main(String[] args) {

		String cumle = "InfotechAcademy1234...!’^.+";
		sayim(cumle);

	}
}
