package assignment9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Sonuc {

	static void compare(int tarih, int ay, int gun, int saat, int dakika) {

		LocalDateTime inpt = LocalDateTime.of(tarih, ay, gun, saat, dakika);

		String inpt1 = inpt.toString();

		System.out.println("\n" + "Girdiginiz tarih ve saat: " + "\t" + inpt1.replace("T", " / "));

		LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		String tokyo1 = tokyo.toString();

		System.out.println("\n" + "Tokyo saati ile kalkis taih ve saatiniz: " + "\t"
				+ tokyo1.substring(0, tokyo1.indexOf(".")).replace("T", " / "));

		LocalDateTime kahire = LocalDateTime.now(ZoneId.of("Africa/Cairo"));
		String kahire1 = kahire.plusHours(15).plusMinutes(5).toString();

		System.out.println("\n" + "Kahire inis tarih ve saatiniz: " + "\t"
				+ kahire1.substring(0, kahire1.indexOf(".")).replace("T", " / "));

	}

}
