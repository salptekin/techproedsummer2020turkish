package day22arraylist;

public class OdevSorusu02 {

	public static void main(String[] args) {
		/*
		 Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip 
		 elemanların toplamını ekrana yazdıran bir program yazınız
         arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }   
		 */
		
		int arr1[][] = { {1,2}, {3,4,5}, {6} };
		int arr2[][] = { {7,8,9}, {10,11}, {12} };
		int sum = 0;
		int idx = 0;
		
		if(arr1.length<=arr2.length) {
			for(int[] w:arr1) {
				for(int i=0; i<w.length; i++) {
					if(arr1[i].length<=arr2[i].length) {
						for(int j=0; j<arr1[i].length; j++) {
							sum = sum + arr1[i][j] + arr2[i][j];
							System.out.println("==>"+arr1[i][j]);
							System.out.println("==>"+arr2[i][j]);
							System.out.println(sum);
							idx=j;
						}
				    }else {
				    	for(int j=0; j<arr2[i].length; j++) {
							sum = sum + arr1[idx][j] + arr2[idx][j];
							System.out.println("==>"+arr1[idx][j]);
							System.out.println("==>"+arr2[idx][j]);
							System.out.println("****" + idx);
							idx++;
							System.out.println(sum);
						}
				    }
				}
		}
		}
		
		System.out.println(sum);
	}
}
