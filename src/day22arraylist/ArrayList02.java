package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu list'i array'e cevirmek icin kullanilir.
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		
		//1. Yontem: toArray() methodu'nun icinde parametre olarak new String[0] kullaniniz
		String arr[] = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		//2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secin
		//Object class, Java'da butun class'larin parent'idir.Yani Object class ortak atadir.
		//Object class, Java'da parent'i olmayan tek class'dir.
		//String, Object class'in child'i oldugundan data type olarak bazi durumlarda
		//String yerine Object kullaniriz.
		Object arr1[] = list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		
		//asList() methodu array'leri list'e cevirmek icin kullanilir.
		//asList() methodu parametre olarak array'in ismini kabul eder.
		
		String arr2[] = {"Aliye", "Canan"};	
		
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);//[Aliye, Canan]
		
		//Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak 
		//esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
		//list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"
		System.out.println(list1);
		
		//list1.remove("Aliye");//remove() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"
		System.out.println(list1);
		
		list1.set(0, "Kemal");//set() methodu calisir.
		System.out.println(list1);

	}

}
