package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// 6, 5, 4, 3, 2, 1, 0, -1 yi ekrana yazdiran bir for loop olusturunuz.		
		for(int i=6; i>-2; i--) {
			System.out.println(i);
		}
		
		//3, 4, 5, 6, 7 sayilarini ekrana yazdiran for loop olusturunuz
		//Baslangic degeri kucuk bitis degeri buyuk ise i++, aksi durumda i-- kullanin
		for(int i=3; i<8; i++) {
			System.out.println(i);
		}
		
		//Ilk 100 sayma sayisini 1 den 100 e kadar ekrana yanyana yazdiran ve aralarina bosluk koyan programi
		//for loop kullanarak yaziniz.
		for(int i=1; i<101; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Ilk 100 sayma sayisini 100 den 1 e kadar ekrana yanyana yazdiran ve aralarina bosluk koyan programi
		for(int i=100; i>0; i--) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		
		//Ilk 50 cift sayma sayisini ekrana yan yana yazdiran for loop olusturunuz
		// 2, 4, 6, ... 100
		for(int i=2; i<101; i=i+2){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Ilk 50 tek sayma sayisini ekrana yan yana yazdiran for loop olusturunuz
		// 1, 3, 5, ... 99
		for(int i=1; i<100; i+=2){
			System.out.print(i + " ");
		}

	}

}
