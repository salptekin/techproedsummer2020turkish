package day14dowhileloop;

public class DoWhile01 { 

	public static void main(String[] args) {
		
		int num1 = 1;				
		do {			
			System.out.println(num1);
			num1++;			
		}while(num1<4);
		
		//10 ile 20 arasindaki tek tamsayilari ekrana do-while loop ile yazdirin.
		//11 13 15 17 19
		int num2=0;
		do {		
			System.out.println(num2);
			num2=num2+2;		
		}while(num2<8);
	}
}
