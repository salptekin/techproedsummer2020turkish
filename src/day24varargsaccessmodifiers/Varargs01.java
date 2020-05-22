package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		//Varargs : Variable Arguments
		//Bir method olusturdugumuzda argument olarak istedigimiz
		//kadar argument girebilmemizi saglar

		countNum(5);
		countNum(5,7,9);
		countNum(5,7,9,11,13,15,17,19,21);
		
		sumNums(2,3);
		sumNums(2,3,4,5);
		sumNums(2,3,4.5,5,6,7,8,9);
		
		printName("Ali");
		printName("Ali", "Kahraman");
		printName("Ali", "Can", "Kahraman");
	}
	
	public static void countNum(int... a) {
		System.out.println(a.length);
	}
	
	public static void sumNums(double... b) {
		double sum=0;
		for(double w: b) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	public static void printName(String... n) {
		for(String w: n) {
			System.out.print(w + " ");
		}
	}
}
