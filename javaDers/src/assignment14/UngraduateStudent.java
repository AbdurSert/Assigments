package assignment14;

public class UngraduateStudent extends Student {

	String minor;

	UngraduateStudent(int no, String name, int year, String date, String major, String minor){
		super.no = no;
		super.name = name;
		super.year = year;
		super.date = date;
		super.major = major;
		this.minor = minor;
	}
	
	
	public void study() {

	}

	public void register() {
		System.out.println("Guncel kayitli");

	}

	public String toString() {
		return "UngraduateStudent [no=" + no + ", name=" + name + ", year=" + year + ", date=" + date + ", major="
				+ major + "]";
	}

}
