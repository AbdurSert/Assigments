package assignmen12;

public class Isci extends Personel {

	public double maasHesap() {

		super.saatlikUcret = 14;

		maas = 22 * 8 * saatlikUcret;
		return maas;
	}

	public double zamHesap() {

		maasHesap();

		zam = maas + (maas * 0.15);

		return zam;

	}

	Personel isci1 = new Personel(54678345, "Ahmet Yener", "Isci", this.maasHesap(), this.zamHesap());
	Personel isci2 = new Personel(45123490, "Selin Ay", "Isci", this.maasHesap(), this.zamHesap());

}
