package assignment13;

import java.util.Scanner;

public class MainCl {

	public static void main(String[] args) throws LackOfRequestException {

		TryCatch obj = new TryCatch();
		TryCatch obj1 = new TryCatch();
		MainChecked obj2 = new MainChecked();
		MainChecked obj3 = new MainChecked();

		obj.tcKimlikCheck();
		obj1.tcKimlik();
		obj2.loginChecked();
		obj3.loginChecked1();

	}
}
