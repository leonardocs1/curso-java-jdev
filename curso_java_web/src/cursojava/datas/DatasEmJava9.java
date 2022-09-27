package cursojava.datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2019, 2, 7);
		
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é anterior a data nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		
		System.out.println("Quantos meses: " + periodo.getMonths());
		
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("Periodo é " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses, e " + periodo.getDays() + " dias.");
	}

}
