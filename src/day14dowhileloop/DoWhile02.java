package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		//do-while ile while loop'larinin farki
		
		int num1=9;
		while(num1<7) {
			System.out.println("While: " + num1); 
			num1++;
		}
		
		int num2=9;
		do {
			System.out.println("Do while: " + num2); 
			num2++;
		}while(num2<7);
		
	}

}
