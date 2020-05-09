package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan başlangıç ve bitiş  harflerini alın ve başlangıç harfinden 
		 * başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic harfini giriniz");
		char ch1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz");
		char ch2 = scan.next().toUpperCase().charAt(0);
		
		System.out.println(ch1 + " - " + ch2);
		
		if(ch1>ch2) {
			
			System.out.println("Harfleri alfabetik sirayla giriniz");
			
		}else if((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A')) {
			
			for(char i=ch1; i<=ch2; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("Baslangic ve bitis harf olmalidir");
		}
	}
}
