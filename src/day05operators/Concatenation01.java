package day05operators;

public class Concatenation01 {

	public static void main(String[] args) {
		
		System.out.println("Ali" + "Can");//AliCan
		System.out.println("Ali " + "Can");//Ali Can
		System.out.println("Ali" + " Can");//Ali Can
		System.out.println("Ali" + " " + "Can");//Ali Can
		
		System.out.println(3 + "4");//En az birisi String ise, toplama degil concatenation yapilir ==> 34
		                            //Concatenation isleminin sonucu String tipindedir
		System.out.println("3" + 4 + 5);//345
		System.out.println("3" + (4 + 5));//39
		System.out.println(3 + 4 + "5");//75
		System.out.println(3 + 4 + "5" + 6);//756
		System.out.println(2*3 + "4" + 6/2);//643
		System.out.println("2*3" + 4 + 5);//2*345
	}
}
