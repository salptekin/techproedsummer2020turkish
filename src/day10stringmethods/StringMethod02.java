package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradiginiz character'in String icindeki son gorunumunun indexini return eder.
		
		// lastIndexOf() methodu 1. versiyonu
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i')); //Ekrana 6 yazdirir. Cunku 'i' characterinin String icinde
		                                           //son gorunumun indexi 6 dir.
		System.out.println(str1.lastIndexOf('r')); // Ekrana 9 yazdirir
		
		// lastIndexOf() methodu 2. versiyonu
		System.out.println(str1.lastIndexOf('i', 5)); //Ilk 5 indexin icinde 'i' harfinin son gorunumunun indexini
		                                              //return eder.
		
		//lastIndexOf() methodu 3. versiyonu
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));// Stringin icindeki 'ri' nin son gorunumunu bulacak.
		                                           // son 'ri' deki 'r' harfinin indexi olan 9 u return edecek
	}

}
