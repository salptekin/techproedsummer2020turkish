package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		// Bu methodu main methodun disinda olusturup main methodun
		// icinden cagiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birimi giriniz");
		String birim = scan.nextLine().toLowerCase();
		System.out.println("Miktari giriniz");
		double miktar = scan.nextDouble();
		
		donusturucu(birim, miktar);
		
		scan.close();
	}
	
	public static void donusturucu(String birim,double miktar) {
		
		switch(birim) {
		
		case "saat":
		     System.out.println(miktar*60*60);
		     break;
		case "mil":
			 System.out.println(miktar*1.6);
			 break;
		case "kilogram":
			 System.out.println(miktar*1000);
			 break;
		default:
			System.out.println("saat, mil ve kilogram disinda bir birim girmeyiniz");		
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
