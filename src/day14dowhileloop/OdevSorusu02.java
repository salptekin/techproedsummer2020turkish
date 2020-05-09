package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
         Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif bir sayi giriniz");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
			i++;
		}	
		scan.close();
	}
}
