package assignment14;

public class VocationalStudent extends Student {

	
	VocationalStudent(int no, String name, int year, String date, String major) {
		super.no = no;
		super.name = name;
		super.year = year;
		super.date = date;
		super.major = major;
	}

	public void study() {

	}

	public void register() {
		System.out.println("Guncel kayitli");
	}

	public String toString() {
		return "VocationalStudent [no=" + no + ", name=" + name + ", year=" + year + ", date=" + date + ", major="
				+ major + "]";
	}

}
