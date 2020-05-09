package day01variables;

public class Variable02 {

	public static void main(String[] args) {
		
		char harf1 = 'a'; //a nin degeri 97
		char harf2 = 'b'; //b nin degeri 98
		// syso sonra ctrl+space => System.out.println();
		System.out.println(harf1 + harf2); //ab mi? 97+98 mi? ==> Cevap: 97+98 yani 195
		
		System.out.println(harf1); // a
		System.out.println(harf2); // b
		
		//ab yazdirmak icin asagidaki yontem kullanilabilir
		System.out.print(harf1);
		System.out.println(harf2);
		
		//Bir char'in sayi degeri ASCII tablosu kullanmadan nasil bulunur?
		//Data type'i int olan bir variable olustur ve char'i bu variable'a ata
		int aCharDeger = 'a';
		System.out.println(aCharDeger);//97
		
		//'!', '%', '*' sembollerinin ASCII degerlerini bulunuz.
		int unlemCharDeger = '!';
		System.out.println(unlemCharDeger);//33
		
		int yuzdeCharDeger = '%';
		System.out.println(yuzdeCharDeger);//37
		
		int asteriksCharDeger = '*';
		System.out.println(asteriksCharDeger);//42
	}
}
