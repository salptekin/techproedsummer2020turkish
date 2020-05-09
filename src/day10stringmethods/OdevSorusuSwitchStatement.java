package day10stringmethods;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {
       public static void main(String[] args) {
    	   /*
    	     Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
             Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
             Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay 28 veya 29 gundur” yazdırın.
             Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
    	   */
    	   
    	   Scanner scan = new Scanner(System.in);
    	   
    	   System.out.println("Ay ismi giriniz");
    	   String ay = scan.next();
    	   ay = ay.toLowerCase();
    	   
    	   switch(ay) {
    	        case "ocak":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        case "subat":
    	        	System.out.println("Bu ay 28 veya 29 gundur");
    	        	break;
    	        case "mart":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        case "nisan":
    	        	System.out.println("Bu ay 30 gundur");
    	        	break;
    	        case "mayis":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        case "haziran":
    	        	System.out.println("Bu ay 30 gundur");
    	        	break;
    	        case "temmuz":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        case "agustos":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        case "eylul":
    	        	System.out.println("Bu ay 30 gundur");
    	        	break;
    	        case "ekim":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        case "kasim":
    	        	System.out.println("Bu ay 30 gundur");
    	        	break;
    	        case "aralik":
    	        	System.out.println("Bu ay 31 gundur");
    	        	break;
    	        default:
    	        	System.out.println("Gecersiz ay ismi");	   
    	   }
   
       }
}
