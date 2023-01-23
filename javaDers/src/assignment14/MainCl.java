package assignment14;

public class MainCl {

	public static void main(String[] args) {
		
		VocationalStudent vc1 = new VocationalStudent(12312, "Ahmet", 1993, "11.23.21", "Kimya");
		VocationalStudent vc2 = new VocationalStudent(12562, "Mehmet", 1997, "11.5.21", "Matematik");
		
		GraduateStudent gs1 = new GraduateStudent(145345, "Ali", 1994, "11.3.21", "Biyoloji", "Fethullah", "Hucreler");
		GraduateStudent gs2 = new GraduateStudent(145654, "Selin", 1991, "11.8.21", "Turkce", "Niyazi", "Fiiler");
		
		UngraduateStudent ug1 = new UngraduateStudent(178676, "Hayri", 1994, "11.1.21", "Tarih", "Inkilap");
		UngraduateStudent ug2 = new UngraduateStudent(178675, "Yasemin", 1996, "11.7.21", "Fizik", "Mekanik");
		
		MasterStudent ms1 = new MasterStudent(567456, "Ayse", 1990, "11.9.21", "Kamu");
		MasterStudent ms2 = new MasterStudent(178676, "Hakan", 1994, "11.2.21", "Maliye");
		
		PhdStudent ph1 = new PhdStudent(345345, "Betul", 1995, "11.5.21", "Isletme", true);
		PhdStudent ph2 = new PhdStudent(178676, "Sinan", 1994, "11.4.21", "Psikoloji", false);
		
		RegistrationOffice ro = new RegistrationOffice();
		
		ro.regsiterStudent(ms2);
		System.out.println(ro.getAStudent(ph2));
		
		
		
		
		
		

	}

}
