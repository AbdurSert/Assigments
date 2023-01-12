package assignment11;

import java.util.ArrayList;
import java.util.List;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci isci1 = new Isci();

		isci1.setId(isci1.idAtama());
		isci1.setIsim("Yeliz");
		isci1.setSoyisim("Kum");
		isci1.setAdres("Utrecht");
		isci1.setTelefon(1456648654);

		Isci isci2 = new Isci();

		isci2.setId(isci1.idAtama());
		isci2.setIsim("Yeliz");
		isci2.setSoyisim("Kum");
		isci2.setAdres("Utrecht");
		isci2.setTelefon(1456648654);

		Isci isci3 = new Isci();

		isci3.setId(isci1.idAtama());
		isci3.setIsim("Yeliz");
		isci3.setSoyisim("Kum");
		isci3.setAdres("Utrecht");
		isci3.setTelefon(1456648654);

		List<Object> isciler = new ArrayList<>();

		isciler.add(isci1.getId());
		isciler.add(isci1.getIsim());
		isciler.add(isci1.getSoyisim());
		isciler.add(isci1.getAdres());
		isciler.add(isci1.getTelefon());

		isciler.add(isci2.getId());
		isciler.add(isci2.getIsim());
		isciler.add(isci2.getSoyisim());
		isciler.add(isci2.getAdres());
		isciler.add(isci2.getTelefon());

		isciler.add(isci3.getId());
		isciler.add(isci3.getIsim());
		isciler.add(isci3.getSoyisim());
		isciler.add(isci3.getAdres());
		isciler.add(isci3.getTelefon());

		System.out.println(isciler);

	}

}
