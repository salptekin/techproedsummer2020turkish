package day17statickeyword;

public class Static04 {

	int num1 = 12;
	static int num2 = 22;
		
	public static void main(String[] args) {
		//static methodlarin icinde sadece static elemanlar kullanilabilir.
		//num1 static olmadigindan main methodun icinde kullanilamaz
		//num2 static oldugundan main methodun icinde kullanmamiz problem olmuyor.
		//num1++; // num1++; nin onundeki commenti kaldirirsaniz Java num1++; nin altini krmizi cizer
		num2++;
	}
}
