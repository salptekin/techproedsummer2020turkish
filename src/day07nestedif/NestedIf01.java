package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan  bir sayi alin
		// Bu sayi pozitif veya sifir ise 9 dan buyuk mu diye kontrol edin, 9 dan buyuk ise ekrana "Sayi" yazdirin
		// 9 dan kucuk esit ve 0'dan buyuk esit ise ekrana "Rakam" yazdirin
		// Bu sayi negatif ise ekrana "Sayi" yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi giriniz");
		int num = scan.nextInt();
		
		if(num>=0) {
			
			if(num>9) {
				System.out.println("Sayi");
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
			}
			
		}else if(num<0) {
			System.out.println("Sayi");
		}
		
		scan.close();//Scanner class'ini kullandiktan sonra en altta main method'un icinde Scanner class'ini kapatiniz.
		             //Scanner class'ini kapatmak icin scan.close(); yazmak yeterlidir.
	}
}
