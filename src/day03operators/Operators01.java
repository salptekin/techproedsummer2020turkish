package day03operators;

public class Operators01 {

	public static void main(String[] args) {
	
		/*
		 1)Parantez ici islemler yapilir
		 2)Carpma ve bolmeler yapilir.Carpma ve bolmeden soldaki once yapilir.
		 3)Toplama ve cikarmalar yapilir.Toplama ve cikarmadan soldaki once yapilir.
		 */
		int i1 = 12;
		int i2 = 13;
		int i3 = 14;
		int i4 = 15;
		
		System.out.println(i1 + i2*i3);//13*14=182 ==> 12+182=194
		System.out.println(i1*i2 + i3*i4);//12*13=156 ==> 14*15=210 ==> 156+210=366
		System.out.println((i1+i2)/i4);//12+13=25 ==> 25/15=1.6... ==> 1
		System.out.println(i4 * (i2 + i1 / 3 ));//

	}

}
