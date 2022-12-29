package assignment7;

public class Question5 {

	int number;
	String name;
	static String collage = "ITS";

	Question5(int r, String n, String collage) {
		this.number = r;
		this.name = n;
		this.collage = collage;
	}

	public static void main(String[] args) {

		Question5 obj = new Question5(111, "Karan", "MIT");
		Question5 obj2 = new Question5(222, "Aryan", "Harward");

		System.out.println(obj.number);
		System.out.println(obj2.number);

		System.out.println(obj.name);
		System.out.println(obj2.name);

		System.out.println(obj.collage);
		System.out.println(obj2.collage);

//		111
//		222
//		Karan
//		Aryan
//		Harward
//		Harward

	}

}
