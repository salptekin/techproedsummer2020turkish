package day13whileloops;

import java.util.Scanner;

public class LoopInterview03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin
		// Bu sayinin tersinin 2 fazlasini ekrana yazdirin.
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		String num = scan.nextLine();
		
		String ters = "";
		
		for(int i=num.length()-1; i>=0; i--) {
			ters = ters + num.charAt(i) + "";//char'i String'e cevirmek icin sonuna + "" ekleyebilirsiniz
		}
		
		System.out.println(ters);
		
		int tersInt = Integer.valueOf(ters);
		tersInt = tersInt+2;
		
		System.out.println(tersInt);	
	}
}
