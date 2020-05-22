package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"] listini olusturun
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list'de eleman olarak B var mi?
		System.out.println(list.contains("B"));//Eger B eleman olarak varsa true, yoksa false return eder
		
		//list'de eleman olarak Z var mi?
		System.out.println(list.contains("Z"));
		
		//list'deki elemanlari alfabetik siraya koyunuz.
		//Collection ==> Bir araya getirilmis parcalar
		//Bir list'deki elemanlari alfabetik siraya (Natural Order) dizmek icin 
		//Collections.sort() methodu kullanilir. Argument olarak list'in adini kullaniniz
		Collections.sort(list);
		System.out.println(list);//[A, B, C, C]
	
	}

}
