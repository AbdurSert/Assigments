package assignment15;

public class Otomobil implements StandartOzellikler {

	int tip;
	int vitesT;
	int secm1;
	int secm2;
	int secm3;
	int secm4;
	int secm5;
	int motorT;

	public String motorTipi(int motorT) {
		this.motorT = motorT;

		if (motorT == 1)
			return "hybride";

		else
			return "elektrik";

	}

	public void enjeksiyon() {

	}

	public void yakitDeposu() {

	}
	
	
public String vitesTipi(int vitesT) {
	this.vitesT = vitesT;
	
	if (vitesT == 1)
		return "Otomatik";
	else
		return "Duz";
		
	}

	String aracTipi(int tip) {
		this.tip = tip;
		if (tip == 1)
			return "Sedan";
		else
			return "spor";

	}

	public String sunRoof(int secm1) {
		this.secm1 = secm1;

		if (secm1 == 1)
			return "mevcut";

		else
			return "mevcut degil";
	}

	public String metalikRenk(int secm2) {
		this.secm2 = secm2;

		if (secm2 == 1)
			return "mevcut";

		else
			return "mevcut degil";

	}

	public String bodyKit(int secm3) {
		this.secm3 = secm3;

		if (secm3 == 1)
			return "mevcut";

		else
			return "mevcut degil";

	}

	public String celikJant(int secm4) {
		this.secm4 = secm4;

		if (secm4 == 1)
			return "mevcut";

		else
			return "mevcut degil";

	}

	public String multiMedia(int secm5) {
		this.secm5 = secm5;

		if (secm5 == 1)
			return "mevcut";

		else
			return "mevcut degil";

	}

	public int tekerlekSayisi() {

		return 4;
	}

	public String absFrenSistemi() {

		return "mevcut";
	}

	public String doseme() {

		return "mevcut";
	}

	public String iklimlendirme() {

		return "mevcut";
	}

	public String bagajHacmi() {

		return "40L";
	}

	public String toString() {
		return "Otomobil [Motor=" + motorTipi(motorT) + ", Sanziman=" + vitesTipi(vitesT) + ", AracTipi=" + aracTipi(tip) + ", sunRoof()=" + sunRoof(secm1)
				+ ", metalikRenk()=" + metalikRenk(secm2) + ", bodyKit()=" + bodyKit(secm3) + ", celikJant()="
				+ celikJant(secm4) + ", multiMedia()=" + multiMedia(secm5) + ", tekerlekSayisi()=" + tekerlekSayisi()
				+ ", absFrenSistemi()=" + absFrenSistemi() + ", doseme()=" + doseme() + ", iklimlendirme()="
				+ iklimlendirme() + ", bagajHacmi =" + bagajHacmi() + "]";
	}

	
	

}
