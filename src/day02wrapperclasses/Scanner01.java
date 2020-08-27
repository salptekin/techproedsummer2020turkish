package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//Kullanici iki tamsayi versin
		//Program  bu tamsayilarin toplamini ve carpimini ekrana yazdirsin.
		
		Scanner scan = new Scanner(System.in);// Scanner classini import ettik 
		
		System.out.println("Lutfen iki tamsayi giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);
		
		scan.close();
	
	}
}
