package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("4 basamakli bir tamsayi giriniz");
		
		int s = scan.nextInt();
		int sonRakam = s % 10;//Bir tamsayinin 1 ler basamagini bulmak icin sayiyi 10 a boleriz.
		int ilkRakam = s / 1000;
		
		System.out.println(sonRakam + ilkRakam);
		
		scan.close();
	}
}
