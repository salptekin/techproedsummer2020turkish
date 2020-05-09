package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca "Ilk harf", B harfini bulunca "Ikinci harf"
		// C harfini bulunca "Ucuncu harf", D harfini bulunca "Dorduncu harf"
		// yazdiran programi if else if() ve switch() kullanarak yaziniz.
		// digerleri icin "Bilmiyorum"
		
		char harf = 'A';
		
		//1. Yol ==> if else if
		
		if(harf=='A') {
			System.out.println("Ilk harf");
		}else if(harf=='B') {
			System.out.println("Ikinci harf");
		}else if(harf=='C') {
			System.out.println("Ucuncu harf");
		}else if(harf=='D'){
			System.out.println("Dorduncu harf");
		}else {
			System.out.println("Bilmiyorum");
		}
		
		//2. Yol ==> switch()
        switch(harf) {
        	case 'A':
        		System.out.println("Ilk harf");
        		break;
        	case 'B':
        		System.out.println("Ikinci harf");
        		break;
        	case 'C':
        		System.out.println("Ucuncu harf");
        		break;
        	case 'D':
        		System.out.println("Dorduncu harf");
                break;
        	default:
        		System.out.println("Bilmiyorum");
        }

	}

}
