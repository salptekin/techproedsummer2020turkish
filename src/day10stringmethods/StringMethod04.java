package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains() methodu bir String in icinde bir characterin olup olmadigini kontrol eder.
		// Eger o character Stringin icinde varsa true yoksa false return eder.
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m"));//false cunku karakartal in icinde 'm' yok
		                                       // contains() methodunun icine herzaman String koyun.
		System.out.println(str1.contains("kar"));//true cunku karakartal in icinde 'kar' var
		
		// trim() methodu bir Stringin bas ve sonundaki bosluklari siler " Ali Can  " ==> "Ali Can"
		// trim() methodu sadece bas ve sondaki bosluklari siler, aradaki bosluklara dokunmaz
		
		String str2 = " Ali Can      ";
		System.out.println("trim() kullanmadan once :" + str2);
		System.out.println("trim() kullandikdan sonra :" + str2.trim());
		
		//isEmpty() methodu bir Stringin icinde character olup olmadigina bakar.
		//character yoksa true, varsa false return eder.
		String str3 = "Ali";
		System.out.println(str3.isEmpty());//false cunku String bos degil
		
		String str4 = " ";
		System.out.println(str4.isEmpty());//false cunku space Java icin bir character
		
		String str5 = "";
		System.out.println(str5.isEmpty());//true cunku hicbir character yok

		//Note: isEmpty() true cikarsa length 0 demektir.
	}
}
