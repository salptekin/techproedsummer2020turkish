package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana "Artik Yil" yazdirin
		// Girilen yil artik yil degil ise ekrana "Artik Yil Degil" yazdirin.
				
		// Artik yil 1) Yil 100 e bolunurse 400 e de bolunmeli ==> 1300 artik yil degil cunku 100 e bolundugu halde 400 e bolunmuyor.
		//                                                     ==> 1200 artik yildir cunku 100 e bolunuyor ve 400 e de bolunuyor.
		//           2) Yil 100 e bolunmezse 4 e bolunmeli 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yil giriniz");
		int yil = scan.nextInt();
		
		if(yil%100 == 0) {
			
			if(yil%400 == 0) {				
				System.out.println("Artik yil");				
			}else {
				System.out.println("Artik yil degil");
			}
			
		}else if(yil%100!=0) {
			
			if(yil%4 == 0) {
				System.out.println("Artik yil");
			}else {
				System.out.println("Artik yil degil");
			}
		}		
		scan.close();
	}
}
