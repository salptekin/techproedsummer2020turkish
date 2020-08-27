package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		//Kullanicidan yasini alin
		//Yas 13 den az ise ekrana "Calisamaz" yazdirin
		//Yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
		//Yas 65 den buyuk ise ekrana "Emekli" yazdirin
		//Negatif sayi girerse "Yas negatif olamaz"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
	
		if(yas<0) {
			System.out.println("Yas negatif olamaz");
		}else if(yas<13) {
			System.out.println("Calisamaz");
		}else if(yas<=65) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}	
		scan.close();
	}
}
