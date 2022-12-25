package assignment6;

public class ArabaOzellikler {

	public static void main(String[] args) {

		Araba ozellik = new Araba("Mercedes", 3564363, 2015, 2.0, "manuel", "benzin");
		Araba ozellik1 = new Araba("Audi", 4563774, 2012, 1.6, "Otomatik", "Dizel");
		Araba ozellik2 = new Araba("Bmw", 5645645, 2019, 3.2, "Manuel", "Lpg");

		Araba ozellik4 = new Araba();
		Araba ozellik5 = new Araba();

		ozellik4.name = "Audi";
		ozellik4.id = 34353453;
		ozellik4.model = 2019;
		ozellik4.motor = 1.2;
		ozellik4.vites = "Otoamtik";
		ozellik4.yakit = "Benzin";

		ozellik5.name = "Toyota";
		ozellik5.id = 34353463;
		ozellik5.model = 2011;
		ozellik5.motor = 1.5;
		ozellik5.vites = "Otoamtik";
		ozellik5.yakit = "Hybrid";

	}

}
