package cursojava.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {

	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-01-01"), LocalDate.now());
		
		System.out.println("Possui " + dias + " decadas entre a faixa de data");
	}
}
