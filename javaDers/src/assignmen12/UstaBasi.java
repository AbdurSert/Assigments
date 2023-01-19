package assignmen12;

public class UstaBasi extends Personel {

	public double maasHesap() {

		super.saatlikUcret = 14.5;

		maas = 22 * 8 * saatlikUcret;
		return maas;
	}

	public double zamHesap() {

		maasHesap();

		zam = maas + (maas * 0.18);

		return zam;

	}

	Personel ustabasi1 = new Personel(56774312, "Hayri Kum", "Ustabasi", this.maasHesap(), this.zamHesap());
	Personel ustabasi2 = new Personel(66129345, "Aysun Kar", "Ustabasi", this.maasHesap(), this.zamHesap());

}
