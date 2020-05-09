package day05operators;

public class Decrement01 {

	public static void main(String[] args) {
		// int data type'inda bir variable olusturun.
		// Bu variable'in degerini 3 yontemi de kullanarak her defasinda 1 azaltin.
		
		int num1 = 12;
		
		//Uzun Yol
		num1 = num1 - 1; // num1 = 11;
		System.out.println(num1);//11
		
		//Kisa yol
		num1-=1;//num1 = 10
		System.out.println(num1);//10
		
		//En Kisa Yol
		num1--;//num1 = 9
		System.out.println(num1);//9
	}
}
