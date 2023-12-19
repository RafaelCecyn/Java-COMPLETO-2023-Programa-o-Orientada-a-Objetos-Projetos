package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-12-11");
		LocalDateTime d05 = LocalDateTime.parse("2022-12-11T01:30:26");
		Instant d06 = Instant.parse("2022-12-11T01:30:26Z");
		
		LocalDate r01 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r02 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r03 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r04 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r01 = " + r01); // r01 = 2022-12-10
		System.out.println("r02 = " + r02); // r02 = 2022-12-11
		System.out.println("r03 = " + r03); // r03 = 2022-12-10T22:30:26
		System.out.println("r04 = " + r04); // r04 = 2022-12-11T01:30:26
		
		System.out.println("d04 dia =  " + d04.getDayOfMonth()); // d04 dia =  11
		System.out.println("d04 mes = " + d04.getMonthValue()); // d04 mes = 12
		System.out.println("d04 ano = " + d04.getYear()); // d04 ano = 2022
		System.out.println("d05 hora = " + d05.getHour()); // d05 hora = 1
		System.out.println("d05 minuto = " + d05.getMinute()); // d05 minuto = 30
		

	}

}
