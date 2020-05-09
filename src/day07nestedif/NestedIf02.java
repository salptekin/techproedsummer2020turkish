package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		// Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
		// Cift sayi ise ekrana "Password tamam" yazdirin, Tek sayi ise "Tekrar deneyin ilk" yazdirin
		// Password 4 basamakli degil ise "Tekrar deneyin son" yazdirin
		
		// 4 basamakli demek 999 dan buyuk 10000 den kucuk demektir.
		
		//0123 Java icin 123 demektir
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tamsayi olan bir password giriniz");
		int password = scan.nextInt();
		
		if(password>999 && password<10000) {
			
			if(password%2 == 0) {
				System.out.println("Password tamam");
			}else if(password%2!=0) {
				System.out.println("Tekrar deneyin ilk");
			}
			
		}else {
			System.out.println("Tekrar deneyin son");
		}
		
		scan.close();
	}
}
