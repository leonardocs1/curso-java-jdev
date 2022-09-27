package cursojava.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava6 {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " + dataAtualHoraAtual);
		
		System.out.println(dataAtualHoraAtual.getHour());
	}

}
