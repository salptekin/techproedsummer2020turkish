package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız. 
		//Not: a’ nın küpü: a x a x a
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz.");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1 * sayi1 * sayi1);
		
		scan.close();

	}

}
