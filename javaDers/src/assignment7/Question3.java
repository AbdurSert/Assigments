package assignment7;

public class Question3 {

	static int x;
	int y;

	Question3() {

		x += 2;
		y++;

	}

	static int getSquare() {

		return x * x;

	}

	public static void main(String[] args) {
		
		Question3 obj = new Question3();
		Question3 obj1 = new Question3();
		
		int z= obj.getSquare();
		
		System.out.println("-x" + z + "-y" + obj.y);
		
//		(-x16-y1)
	
	}


}