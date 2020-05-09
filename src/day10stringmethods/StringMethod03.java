package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// charAt() methodu belli indexteki characteri return eder.
		
		String str1 = "cimbombom";
		//str1 in 4. indexindeki characteri bulan kodu yaziniz.
		System.out.println(str1.charAt(4));// indexi 4 olan character 'o' harfidir, bu yuzden ekrana 'o' yazdirir
		System.out.println(str1.charAt(0));// index 0 ilk harf demektir bu yuzden 'c' return eder.
		System.out.println(str1.charAt(6));//Olmayan bir index ile islem yapmaya calisirsaniz console 
		                                    //"Exception" alirsiniz. Bu da buyuk bir hata yaptiniz demektir.
		
		// length() methodu Stringin icinde kac character oldugunu verir
		System.out.println(str1.length());// Ekrana 9 yazdirir. index saymaya 0 dan baslar fakat
		                                  // lenght() saymaya 1 den baslar.
		
		//Soru: Son indexi 9 olan bir String'in length i kactir?
		//Cevap: 9+1=10 olur.
		//length = son index + 1
		
		// Kullanicidan ismini girmesini isteyin.
		// Isminin son harfini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Isminizi giriniz");
		String isim = scan.nextLine();
		
		int length = isim.length();
		System.out.println(isim.charAt(length-1));
		
		scan.close();
	}

}
