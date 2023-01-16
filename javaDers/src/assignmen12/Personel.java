package assignmen12;

public class Personel {

	private int id;
	private String isim;
	private String statu;
	double maas;
	double zam;
	double saatlikUcret = 13.5;

	public double maasHesap() {

		maas = 22 * 8 * saatlikUcret;
		return maas;
	}

	public double zamHesap() {

		maasHesap();

		zam = maas + (maas * 0.10);

		return zam;

	}

	public Personel() {

	}

	public Personel(int id, String isim, String statu, double maas, double zam) {
		this.id = id;
		this.isim = isim;
		this.statu = statu;
		this.maas = maas;
		this.zam = zam;
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

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public double getZam() {
		return zam;
	}

	public void setZam(double zam) {
		this.zam = zam;
	}
}
