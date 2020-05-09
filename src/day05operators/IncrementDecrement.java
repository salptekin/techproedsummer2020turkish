package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data type'inda bir variable olusturun.
		// Bu variable'in degerini carpma ve bolme kullanarak
		// artirin ve azaltin.
		
		int num1 = 12;
		
		//Uzun Yol ile carpma yaparak increment
		num1 = num1 * 3;//num1 = 36
		System.out.println(num1);//36
		
		//Kisa Yol
		num1*=3;//36*3=108
		System.out.println(num1);//108
		
		//Uzun Yol ile bolme yaparak decrement
		num1 = num1 / 9; //108/9=12
		System.out.println(num1);//12
		
		//Kisa Yol
		num1/=2; // 12/2=6
	}
}
