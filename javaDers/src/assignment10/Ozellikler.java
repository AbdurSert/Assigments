package assignment10;

public class Ozellikler {

	private String plaka;
	private String isim;
	private String dogum;
	private String renk;
	private String marka;
	private int model;
	private double motorHacmi;

	public Ozellikler() {

	}

	public Ozellikler(String plaka, String isim, String dogum, String renk, String marka, int model,
			double motorHacmi) {
		super();
		this.plaka = plaka;
		this.isim = isim;
		this.dogum = dogum;
		this.renk = renk;
		this.marka = marka;
		this.model = model;
		this.motorHacmi = motorHacmi;
	}

	public String getPlaka() {

		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getDogum() {
		return dogum;
	}

	public void setDogum(String dogum) {
		this.dogum = dogum;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public double getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(double motorHacmi) {
		this.motorHacmi = motorHacmi;
	}

}
