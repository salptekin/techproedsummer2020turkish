package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		//Kullanicidan password girmesini isteyin
		//password dogru ise ekrana "Password dogru" yazdirin
		//password yanlis ise ekrana "Password yanlis tekrar deneyin" yazdirin
		//Dogru password = Java2020
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Passwordunuzu giriniz");
		String password = scan.next(); 
		
		//String'lerin esitligini kontrol ederken
		//asla "==" sembolu kullanmayin. Onun yerine
		//"equals()" kullanin
		
		//"==" String'in degerini ve adresini kontrol eder
		//"equals()" ise sadece degerleri kontrol eder.
		
		if(password.equals("Java2020")) {
			System.out.println("Password dogru");
		}else {
			System.out.println("Password yanlis tekrar deneyin");
		}
		scan.close();
	}
}
