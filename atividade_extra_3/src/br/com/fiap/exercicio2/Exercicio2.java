package br.com.fiap.exercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.of(2012, 9, 10, 12, 00);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		System.out.println(localDateTime.format(dtf));
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(localDateTime.format(dtf2));
		System.out.println(localDateTime.getDayOfWeek() + " (dia da semana)");
		System.out.println(localDateTime.getYear() + " (ano)");
		System.out.println(localDateTime.toLocalDate().getEra()+ " (era)");
	}

}
