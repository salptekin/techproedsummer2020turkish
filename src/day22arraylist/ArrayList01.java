package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listin birbirine esit olup olmadigini kontrol eder.
		// List'ler esit ise "true", degilse "false" return eder.
		// equals() methodu ayni index'de ayni elemanin olup olmadigini kontrol eder.
		// equals() methodu'ndan true alabilmek icin list'ler birbirinin fotokopisi 
		// gibi olmalidir.
		// equals() methodu objelerin reference(adres)'larina bakmaz.
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));//true
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));//false cunku biri bos digerinde A ve B var
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));//false cunku elemanlarin siralari ayni degil
	
	}

}
