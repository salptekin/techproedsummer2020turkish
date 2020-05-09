package day05operators;

public class Increment04 {

	public static void main(String[] args) {
		// int data type'inda bir tane variable olusturun.
		// Bu variable'i her seferinde 1 artirmak icin 3 yontemi de kullanin.
		
		int num1 = 12;
		//Uzun Yol
		num1 = num1 + 1; //num1 = 13
		System.out.println(num1);//13
		
		//Kisa Yol
		num1+=1;// num1 = 14
		System.out.println(num1);//14
		
		//En Kisa Yol
		num1++;//num1 = 15
		System.out.println(num1);//15
	}
}
