package assignment14;

public abstract class Student {

	int no;
	String name;
	int year;
	String date;
	String major;

	public Student() {

	}

	public Student(int no, String name, int year, String date, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.date = date;
		this.major = major;
	}

	public void study() {

	}

	public abstract void register();

	
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", date=" + date + ", major=" + major + "]";
	}

}



