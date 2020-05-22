package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Multi Dimesional Array Olusturup Deger Atama 2. Yontem
		
		int arr[][] = { {1, 2}, {3}, {4, 5, 6, 7}, {8, 9} };
		
		System.out.println(Arrays.deepToString(arr));
		
		// 2, 3 ve 6 nin toplamini ekrana yazdiriniz
		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]);//2+3+6=11
		
		//arr arrayindeki tum elemanlarin toplamini veren programi yaziniz.
		//{ {1, 2}, {3}, {4, 5, 6} }
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++ ) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println("Tum elemanlarin toplami: " + sum);
	}

}
