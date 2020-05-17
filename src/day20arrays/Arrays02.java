package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integerin array'in elemanlarini kucukten buyuge diziniz 
		// ve ekrana iki durumu da yazdiriniz
		
		int arr[] = {2, 11, 0, 23, 7};
		System.out.println("Siralamadan once: " + Arrays.toString(arr));
		//Arrays.sort() methoduna parametre olarak array'in ismi yazilirsa
		//o array'in elemanlari kucukten buyuge (Ascending order, natural order) siralanmis olur.
		Arrays.sort(arr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arr));
		
		//Soru: char'lardan olusan bir array olusturunuz ve "ascending order" yapiniz
		// char'lar siralanirken Java ASCII kodlari kullanir. 
		// Buyuk harflerin ASCII kodlari kucuk harflerden azdir; bu yuzden siralamada
		// buyuk harfler one gecer.
		//Java rakamlarin ASCII kodunu o rakamin degeri gibi dusunur.
		char arrCh[] = {'a', 'd', 'c', 'A'};
		System.out.println("Siralamadan once: " + Arrays.toString(arrCh));
		
		Arrays.sort(arrCh);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arrCh));
		
		//Soru: String'lerden olusan bir array olusturun ve ascending order yapin
		String arrStr[] = {"Ali", "ahmet", "Ahmet", "Can", "Beyza"};
		System.out.println("Siralamdan once: " + Arrays.toString(arrStr));
		
		Arrays.sort(arrStr);
		System.out.println("Siralamadan sonra: " + Arrays.toString(arrStr));
		
		//Soru: boolean bir array olusturun ascending order yapin
	    //boolean'lar icin sort methodu kullanilamaz
  
	}
}
