package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin ve o tamsayinin
		// mutlak degerini ekrana yazdirin
		// mutlak deger bir sayinin kendi isareti ile carpilmasi demektir
		// Ornek: -3 un mutlak degeri: -1.-3 = 3
		// Ornek: +5 in mutlak degeri: +1.+5 = 5
		// Ornek: 0 in mutlak degeri 0 dir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi giriniz");
		
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println(num*(+1));			
		}else {
			System.out.println(num*(-1));
		}
		scan.close();
	}
}
