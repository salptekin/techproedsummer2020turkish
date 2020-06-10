package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanlari A, B, ve C olan bir list olusturunuz
		// List iterator kullanarak bu elemanlari AW, BW, ve CW'ye donusturunuz
		
		 List<String> list = new ArrayList<String>();
		 list.add("A");
		 list.add("B");   
		 list.add("C");
		 System.out.println(list);
		 
		 ListIterator<String> lit = list.listIterator();
		 
		 //Elemanlari AW BW CW yap
		 while(lit.hasNext()) {
			 Object element = lit.next();
			 lit.set(element + "W");
		 }
		 System.out.println(list);//[AW, BW, CW]
		 
		 lit.add("Kemal");
		 lit.add("Can");
		 
		 System.out.println(list);//[AW, BW, CW, Kemal, Can]

	}

}
