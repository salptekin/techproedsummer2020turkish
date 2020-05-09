package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// Basit hesap makinasi
		// Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalim
		// Kullanicidan iki sayi girmesini isteyelim
		// Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("+, -, x, : islemlerinden birini seciniz");
		char islem = scan.next().charAt(0);
		System.out.println("Islem yapmak icin iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		hesapMakinasi(islem,num1,num2);

	}
	
	public static void hesapMakinasi(char islem, double num1, double num2) {
		
		switch(islem) {
		
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 'x':
			System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
			break;
		case ':':
			System.out.println(num1 + " : " + num2 + " = " + (num1/num2));
			break;
		default:
			System.out.println("+,-,x,: disinda bir islem secmeyiniz");
		
		}
	}

}
