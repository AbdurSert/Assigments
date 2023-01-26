package assignment15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCl {

	public static void main(String[] args) {
		List<String> harfler = new ArrayList<>();

		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		harfler.add("D");
		harfler.add("E");
		harfler.add("F");
		
		System.out.println(harfler);

		ListIterator<String> harf = harfler.listIterator();
		
		
		int i = harfler.size()-1;
		while(harf.hasNext()){
			
			harf.next();
			
			harf.set(harfler.get(i));
			
			i--;
		}
		
		System.out.println(harfler);
	}

}
