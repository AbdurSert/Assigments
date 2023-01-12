package assignment11;

import java.util.Random;

public class Personel {

	private int id;
	private String isim;
	private String soyisim;
	private String adres;
	private int telefon;

	public Personel() {

	}

	public int idAtama() {

		int high = 999999;
		int low = 100000;

		Random pick = new Random();
		id = pick.nextInt(high - low) + low;

		return id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

}
