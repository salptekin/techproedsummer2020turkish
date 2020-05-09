package day13whileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3 un carpim tablosunu ekrana yazdiran programi yaziniz
		// 3x1=3, 3x2=6, ..., 3x10=30
		
		System.out.println("For Loop ile cozum");
		for(int i=1; i<11; i++) {
			System.out.println("3x" + i + "=" + (3*i));
		}
		
		System.out.println("While Loop ile cozum");
		int num=1;
		while(num<11) {
			System.out.println("3x" + num + "=" + (3*num));
			num++;
		}
	}
}
