package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Kullanicidan bir String alin
		// Bu String'in indexi tek sayi olan character'lerini ekrana yazdirin
		// Almanya ==> l, a, y ==> yazdirmali
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz.");
		String str = scan.nextLine();
		
		int length = str.length();
		int i=0;
		
		do {
			if(i%2==1) {
				System.out.print(str.charAt(i) + " ");
			}
			i++;
		}while(i<length);
		scan.close();
	}
}
