package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str1 = "Ali Can okula basladi, nasil oldu? Iyi oldu ama zor.";
		
		//split() methodunu kullandiginizda mutlaka bir array olusturmalisiniz.
		String kelime[] = str1.split(" ");

		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayisi: " + kelime.length);
		
		String str2 = "Kahramanmaraslilar iyi mi?";
		
		String harf[] = str2.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayisi: " + harf.length);
	}
}
