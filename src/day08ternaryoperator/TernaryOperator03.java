package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz
		// Kucuk sayiyi ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		//result sonuc demektir
		
		double result = num1>=num2 ? num2 : num1;
		System.out.println(result);
		
		scan.close();
	}

}
