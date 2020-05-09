package day13whileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		// Ilk 5 sayma sayisinin carpiminin sonucunu ekrana yazdiran 
		// programi yaziniz
		
		int product = 1;
		int num = 1;
		
		while(num<6) {
			product = product * num;
			num++;
		}
		System.out.println(product);//1*2*3*4*5=120
	}
}
