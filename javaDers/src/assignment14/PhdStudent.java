package assignment14;

public class PhdStudent extends GraduateStudent {

	boolean QualyfyingExamTaken;
	

	PhdStudent(int no, String name, int year, String date, String major, boolean QualyfyingExamTaken) {
		super.no = no;
		super.name = name;
		super.year = year;
		super.date = date;
		super.major = major;
		this.QualyfyingExamTaken = QualyfyingExamTaken;
	}

	public void study() {

	}

	public void register() {
		System.out.println("Kayit beklemede");
	}

	void WriteThesis() {

	}

	void MeetWithAdvisor() {

	}
	
	void writePaper() {
		
		
	}
}
