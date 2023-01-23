package assignment14;

public class GraduateStudent extends Student {

	String advisor;
	String thesis;

	public GraduateStudent() {

	}

	public GraduateStudent(int no, String name, int year, String date, String major, String advisor, String thesis) {
		super.no = no;
		super.name = name;
		super.year = year;
		super.date = date;
		super.major = major;
		this.advisor = advisor;
		this.thesis = thesis;

	}

	public void study() {

	}

	void WriteThesis() {

	}

	void MeetWithAdvisor() {

	}

	public void register() {
		System.out.println("Kaydi arsivde");

	}

}
