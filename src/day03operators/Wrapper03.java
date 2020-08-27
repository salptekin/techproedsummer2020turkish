package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullanicidan ad ve soyadini alalim ekrana yazdiralim
		//Kullanicidan adresini alalim ekrana yazdiralim (2. cadde Bakirkoy Istanbul Turkiye)
		//Kullanicidan yasini alalim ekrana yazdiralim.
		//Kullaniciya "Turkiye'de yasiyorum. true/false" diye soralim cevabini ekrana yazdiralim
		//true veya false olarak
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ad ve soyadinizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Adresinizi giriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Turkiye'de yasiyorum. true/false");
		boolean blTr = scan.nextBoolean();
		System.out.println(blTr);
		
		scan.close();

	}

}
