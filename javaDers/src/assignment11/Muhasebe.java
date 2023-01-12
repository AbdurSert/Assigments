package assignment11;

public class Muhasebe extends Personel {

	private int saatlikUcret = 12;
	private String statu;
	private int maas;
	private int gun;

	public int maasHesapla(int gun) {

		this.gun = gun;

		maas = saatlikUcret * 8 * gun;

		return maas;

	}

}
