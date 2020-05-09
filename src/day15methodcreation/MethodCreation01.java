package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
	
		System.out.println(toplama(11,15.2));//26.2
		System.out.println(carpma(13,5));//65

	}
	
	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
	//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
	//Methodu cagirirken method parantezinin icine yazilan degerlere "Argument" denir.
	//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli
	
	public static double toplama(int num1,double num2) {
		 return num1+num2;
	}
	
	public static int carpma(int num1, int num2){
		 return num1*num2;
	}

}
