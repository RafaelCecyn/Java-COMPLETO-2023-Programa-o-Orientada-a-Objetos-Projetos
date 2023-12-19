package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-12-11");
		LocalDateTime d05 = LocalDateTime.parse("2022-12-11T01:30:26");
		Instant d06 = Instant.parse("2022-12-11T01:30:26Z");
		Instant d07 = Instant.parse("2022-12-11T01:30:26-03:00");// Pega o horário GMT com base em GMT-3
		
		LocalDate d08 = LocalDate.parse("11/12/2022",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("11/12/2022 01:30",fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 12, 11);
		LocalDateTime d11 = LocalDateTime.of(2022,12,11,1,30);
		
		
		System.out.println("d01 = " + d01); // d01 = 2023-12-12
		System.out.println("d02 = " + d02); // d02 = 2023-12-12T14:33:38.445854694
		System.out.println("d03 = " + d03); // d03 = 2023-12-12T17:34:15.647908638Z
		System.out.println("d04 = " + d04); // d04 = 2022-12-11
		System.out.println("d05 = " + d05); // d05 = 2022-12-11T01:30
		System.out.println("d06 = " + d06); // d06 = 2022-12-11T01:30:26Z
		System.out.println("d07 = " + d07); // d07 = 2022-12-11T04:30:26Z
		System.out.println("d08 = " + d08); // d08 = 2022-12-11
		System.out.println("d09 = " + d09); // d09 = 2022-12-11T01:30
		System.out.println("d10 = " + d10); // d10 = 2022-12-11
		System.out.println("d11 = " + d11); // d11 = 2022-12-11T01:30

	}

}
