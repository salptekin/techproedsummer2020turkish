package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Iki array olusturup bu array'lerin birbirine esit olup olmadigini kontrol ediniz.
		// Not: Iki arrayin esit olabilmesi
		//      1) Elemanlar ayni olmali
		//      2) Esit elemanlarin index'leri de esit olmali
		// {1, 2, 3} ve {1, 2, 3} esittir. Ama, {1, 2, 3} ile {1, 3, 2} esit degildir.
		
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		
		System.out.println(arr1==arr2);//false cunku reference'lar farkli. "==" adresleri de kontrol
		                               // eder. Iki array farkli iki object oldugundan adresleri farklidir
		
		System.out.println(Arrays.equals(arr1, arr2));//true verir cunku
		                              // Arrays.equals() methodu sadece degerleri ve index'leri
		                              // kontrol eder, adreslere bakmaz.
	}

}
