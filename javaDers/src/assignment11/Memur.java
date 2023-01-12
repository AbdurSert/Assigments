package assignment11;

import java.util.ArrayList;
import java.util.List;

public class Memur extends Muhasebe {

	public static void main(String[] args) {

		Personel memur1 = new Memur();

		memur1.setId(memur1.idAtama());
		memur1.setIsim("Ahmet");
		memur1.setSoyisim("Sert");
		memur1.setAdres("Amsterdam");
		memur1.setTelefon(647376463);

		Personel memur2 = new Memur();

		memur2.setId(memur1.idAtama());
		memur2.setIsim("Ayse");
		memur2.setSoyisim("Turpcu");
		memur2.setAdres("Amstelveen");
		memur2.setTelefon(644332467);

		Personel memur3 = new Memur();

		memur3.setId(memur1.idAtama());
		memur3.setIsim("Hakan");
		memur3.setSoyisim("Sukur");
		memur3.setAdres("Nijmegen");
		memur3.setTelefon(645472345);

		List<Object> memurlar = new ArrayList<Object>();

		memurlar.add(memur1.idAtama());
		memurlar.add(memur1.getIsim());
		memurlar.add(memur1.getSoyisim());
		memurlar.add(memur1.getAdres());
		memurlar.add(memur1.getTelefon());

		memurlar.add(memur2.idAtama());
		memurlar.add(memur2.getIsim());
		memurlar.add(memur2.getSoyisim());
		memurlar.add(memur2.getAdres());
		memurlar.add(memur2.getTelefon());

		memurlar.add(memur3.idAtama());
		memurlar.add(memur3.getIsim());
		memurlar.add(memur3.getSoyisim());
		memurlar.add(memur3.getAdres());
		memurlar.add(memur3.getTelefon());

		System.out.println(memurlar);

	}

}
