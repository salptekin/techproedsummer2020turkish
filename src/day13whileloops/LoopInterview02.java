package day13whileloops;

import java.util.Scanner;

public class LoopInterview02 {

	public static void main(String[] args) {
		
		// Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin
		// While Loop kullanin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle veya kelime giriniz");
		String str = scan.nextLine();

		int length = str.length()-1;
		
		while(length>=0) {
			System.out.print(str.charAt(length));
			length--;
		}
		
		scan.close();

	}

}
