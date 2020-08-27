package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
		//Iki tane variable'in degerlerini yer degistiriniz
		// sayi1=12, sayi2=30 ==> sayi1=30, sayi2=12 (Bu isleme swap denir)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yerlerini degistirmek icin iki sayi giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		//1. Yol
		System.out.println("Yer degistirmeden once:");
		System.out.println(sayi1);//12.0
		System.out.println(sayi2);//30.0
		
		double gecici = 0.0;//variable olustururken data type sadece bir kere yazilir
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("Yer degistirdikten sonra:");
		System.out.println(sayi1);//30.0
		System.out.println(sayi2);//12.0
		System.out.println(gecici);//12.0
			
		//2. Yol
		System.out.println("Yer degistirmek iki sayi daha giriniz");
		
		double sayi3 = scan.nextDouble(); 
		double sayi4 = scan.nextDouble();
		
		sayi3 = sayi3 + sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;

		System.out.println("Yer degistirdikten sonra:");
		System.out.println(sayi3);//30.0
		System.out.println(sayi4);//12.0
		
		scan.close();

	}

}
