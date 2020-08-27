package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
         cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
         Not: Alan: Boy x En
         Not: Çevre: 2x (Boy + En)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin en ve boyunu giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println(en*boy); //50
		System.out.println(2*(en+boy));//30

		scan.close();
	}

}
