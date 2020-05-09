package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startsWith() methodu bir String'in istenen harfle baslayip baslamadigini
		// kontrol eder. Istenen harfle basliyorsa true, istenen harfle baslamiyorsa false return eder.
		
		String str1 = "Ali Can";
		
		//startsWith() 1. versiyon
		System.out.println(str1.startsWith("A"));//true
		System.out.println(str1.startsWith("B"));//false
		System.out.println(str1.startsWith("a"));//false
		
		System.out.println(str1.startsWith("Ali"));//true
		
		//startsWith() 2. versiyon
		System.out.println(str1.startsWith("a", 3));//false
		System.out.println(str1.startsWith("a", 5));//true
		
		System.out.println(str1.startsWith("Can",4));//true
		
		
		//endsWith() methodu bir String'in istenen harfle bitip bitmedigini
		//kontrol eder. Istenen harfle bitiyorsa true, istenen harfle bitmiyorsa false return eder.
		
		String str2 = "Ayse Canan";
		
		System.out.println(str2.endsWith("n"));//true
		System.out.println(str2.endsWith("Canan"));//true
		
		System.out.println(str2.endsWith("CANAN"));//false
		
		System.out.println(str2.endsWith("")); // "" ve " " tamamiyla farklidir. Ikincinin icinde bosluk karakteri var
		                                       // Birincinin icinde hicbirsey yok. true verir
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));//true
		System.out.println(str3.endsWith(""));//true
		System.out.println(str3.startsWith(""));//true
	}
}
