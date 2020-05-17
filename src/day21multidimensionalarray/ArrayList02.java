package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturun isim list01 olsun elemanlar integer olsun
		
		//List'ler data type olarak primitive'leri kabul etmez
		//Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullaniriz.
		List<Integer> list01 = new ArrayList<>();
		
		//Bu list'in icinde eleman olup olmadigini kontrol edin. isEmpty() methodu kullanilir.
		//isEmpty() methodu list bos ise true, dolu ise false return eder.
		System.out.println(list01.isEmpty());//true
		
		//Bu list'e bir eleman ekleyin ve tekrar isEmpty() kullanin
		list01.add(123);
		System.out.println(list01.isEmpty());//false
		
		//List'den eleman silmek. remove() methodu kullnilir.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		list01.remove(1);//Index'i 1 olan elemani siler
		System.out.println(list01);//[123, 125, 124]
		//123'u silin
		list01.remove(0);//Index'i 0 olan elemani siler
		System.out.println(list01);//[125, 124]
		//List'deki son elemani silin.
		list01.remove(list01.size()-1);
		System.out.println(list01);//[125]
	}
}
