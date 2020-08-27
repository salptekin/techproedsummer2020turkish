package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		//Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazınız. 
		//(String kullanınız) 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine();//String'leri kullanicidan almak icin ya next() veya nextLine()
		                              //kullaniriz. next() tek kelimelik String'ler icin kullanilir.
		                              //Space gorunce String'i almayi birakir.
		                              //nextLine() girilen tum String'i almak icin kullanilir.
		System.out.println(isim);
		
		scan.close();

	}

}
