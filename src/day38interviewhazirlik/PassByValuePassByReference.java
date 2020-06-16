package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		//Bir method'a variable yollandiginda Java o variable'in
		//kopyasini olusturur ve method'a kopyayi yollar bu yuzden variable'in
		//orjinal degeri method calistiktan sonra da ayni kalir.
		//Buna Pass By Value denir.
		
		//Pass by Reference'da ise reference'in kopyasi olusturulur ve methoda yollanir
		//fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
		//deger degisir.
		
		int x = 12;
		System.out.println(increment(x));//13
        System.out.println(x);//12
	}
	
	public static int increment(int a) {
		a = a + 1;
		return a;
	}

}
