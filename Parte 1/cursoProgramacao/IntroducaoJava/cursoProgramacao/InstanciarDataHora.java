package cursoProgramacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class InstanciarDataHora {

	public static void main(String[] args) throws ParseException {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // criamos um formato customizado com dd/MM/yyyy
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // formato com HH:mm
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		// AULA 2
		
		LocalDate d12 = LocalDate.parse("2022-07-20");
		LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // pega o fusohorario local
		
		System.out.println("d12 = " + d12.format(fmt3));
		System.out.println("d12 = " + fmt3.format(d12));
		System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d13 = " + d13.format(fmt3));
		System.out.println("d13 = " + d13.format(fmt4));
		System.out.println("d14 = " + fmt5.format(d14));
		
		// AULA 3 Convertendo data global para local
		
		LocalDate d15 = LocalDate.parse("2022-07-20");
		LocalDateTime d16 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d17 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d17, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d17, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d17, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d17, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d15 dia = " + d15.getDayOfMonth());
		System.out.println("d15 dia = " + d15.getMonthValue());
		System.out.println("d15 dia = " + d15.getYear());
		System.out.println("d16 dia = " + d16.getHour());
		System.out.println("d16 dia = " + d16.getMinute());
		
		
		// semanas dias meses horas minutos para frente ou para tras;
		
		LocalDate d18 = LocalDate.parse("2022-07-20");
		LocalDateTime d19 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d20 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d18.minusDays(7);
		LocalDate nextWeekLocalDate = d18.plusDays(7);
		
		System.out.println("d18 dia = " + pastWeekLocalDate);
		System.out.println("d18 dia = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d19.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d19.plusDays(7);
		
		System.out.println("d18 dia = " + pastWeekLocalDate);
		System.out.println("d18 dia = " + nextWeekLocalDate);
		
		Instant pastWeekInstant = d20.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d20.plus(7, ChronoUnit.DAYS);
		
		System.out.println("d18 dia = " + pastWeekInstant);
		System.out.println("d18 dia = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d18.atTime(0, 0));  //LOCAL DATE NAO TEM INFORMACAO DE TEMPO, DA ERRO //at.Time e atStartOfDay() melhor.
		System.out.println("T1 dias = "+ t1.toDays());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d19);
		System.out.println("T2 dias = "+ t2.toDays());
		Duration t3 = Duration.between(pastWeekInstant, d20);
		System.out.println("T3 dias = "+ t3.toDays());
		Duration t4 = Duration.between(d20, pastWeekInstant);
		System.out.println("T4 dias = "+ t4.toDays());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3));
		System.out.println("X4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-----------------------------------------------");
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("-----------------------------------------------");
		
		//adicionando hora com calender
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		// obtendo uma unidade de tempo
		
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println(minutes);
		
		int mouth = 1 + cal.get(Calendar.MONTH); // o mes comeca com o valor 0 por isso o +1
		System.out.println(mouth);
		
		

		
		
	}

}
