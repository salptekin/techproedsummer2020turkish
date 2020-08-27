package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		//Kullanicidan ilk ismini alin ekrana yazdirin.
		//Kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ilk isminizi giriniz");
		String ilkIsim = scan.nextLine();
		
		System.out.println("Soy isminizi giriniz");
		String soyIsim = scan.nextLine();
		
		System.out.println(ilkIsim);
		System.out.println(soyIsim);
		
		scan.close();
	}

}
