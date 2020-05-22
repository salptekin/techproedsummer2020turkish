package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bugunun tarihini ekrana yazdiralim
		System.out.println(LocalDate.now());
				
		// Bugunun zamanini saat, dakika, saniye ve salise olarak ekrana yazdiralim
		System.out.println(LocalTime.now());
		
		// Bugunun tarihini ve zamanini ekrana yazdiralim
		System.out.println(LocalDateTime.now());//2020-05-20T11:02:06.295 Buradaki "T" tarih ile
		                                        // zamani ayirmak icin konuluyor.
	}
}
