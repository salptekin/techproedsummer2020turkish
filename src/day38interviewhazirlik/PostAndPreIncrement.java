package day38interviewhazirlik;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		int a = 12;
		//Post increment
		a = a++;
		System.out.println(a);//12
		
		int b = 22;
		//Post increment
		b++;
		System.out.println(b);//23
		
		int c = 32;
		//Pre increment
		c = ++c;
		System.out.println(c);//33	
	}
}
