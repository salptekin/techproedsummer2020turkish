package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// Kullanicidan bir dikdortgenin en ve boyunu alin.
		// En ve boy esit ise ekrana "Bu bir karedir" yazdirin
		// En ve boy farkli ise ekrana "Bu bir dikdortgendir" yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dikdortgenin enini giriniz");
		double en = scan.nextDouble();
		
		System.out.println("Dikdortgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		//Uzun Yol
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}
		if(en!=boy) {
			System.out.println("Bu bir dikdortgendir");
		}
		
		//Kisa Yol
		//else ==> diger ihtimallerin tamami
		//en ile boy ya esittir ya da degildir
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}else {
			System.out.println("Bu bir dikdortgendir");
		}
		
		scan.close();

	}

}
