package day07nestedif;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		//“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a, e, i, o, u, b, c, d, f harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
		
		if(harf=='a' || harf=='e' || harf=='i' || harf=='o' || harf=='u' ) {
			System.out.println(harf + " sesli harftir.");
		}else if(harf=='b' || harf=='c' || harf=='d' || harf=='f') {
			System.out.println(harf + " sessiz harftir.");
		}else {
			System.out.println("Yanlis harf girdiniz.");
		}
		
		scan.close();
	}
}
