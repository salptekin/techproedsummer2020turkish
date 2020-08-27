package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		// Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın. 
		// Diğer durumlarda ekrana “Harf değil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir character girin");
		char harf = scan.next().charAt(0); //Kullanicidan char almak icin next().charAt(0) kullanilir.
		
		if((harf<=122 && harf>=97) || (harf<=90 && harf>=65)) {
			System.out.println("Bu bir harftir");
		}else {
			System.out.println("Bu bir harf degildir");
		}

		scan.close();
	}

}
