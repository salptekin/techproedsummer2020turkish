package day22arraylist;

import java.util.Arrays;

public class OdevSorusu01 {

	public static void main(String[] args) {
	//Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların 
	//toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
	// ve yeni array’i ekrana yazdıran bir program yazınız  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
			
		int arr[][] = { {1,2,3}, {4,5,11}, {6,7}, {8, 9, 10}};
		int arrToplam[] = new int[arr.length];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				sum = sum + arr[i][j];
			}			 
			arrToplam[i] = sum;
			sum=0;
		}
		
		System.out.println(Arrays.toString(arrToplam));
	}
}
