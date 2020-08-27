package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		// Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
		//“Pazar” ise ekrana “Hıristiyanlar icin kutsal gün” yazdırın.
		// Diger gunler icin ekrana "Kutsal gun degil" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gun giriniz"); 
		
		String gun = scan.next();
		
		if(gun.equalsIgnoreCase("Cuma")) { //equalsIgnoreCase() buyuk kucuk harf dikkate almadan esitlige bakar
			                               //equalsIgnoreCase() icin cuma = Cuma = CUMA = CuMa ayni kabul edilir.
			System.out.println("Muslumanlar icin Kutsal gun");
			
		}else if(gun.equalsIgnoreCase("Cumartesi")) {
			
			System.out.println("Yahudiler icin kutsal gun");
			
		}else if(gun.equalsIgnoreCase("Pazar")) {
			
			System.out.println("Hristiyanlar icin kutsal gun");
			
		}else {
			
			System.out.println("Kutsal gun degil");
			
		}
		
		scan.close();
	}
}
