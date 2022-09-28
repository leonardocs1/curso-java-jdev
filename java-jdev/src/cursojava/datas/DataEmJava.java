package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEmJava {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("11/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("07/04/2021");
		
		// After se data1 é maior que data2
		// before se data1 é menor que data2
		
		if (dataAtualHoje.before(dataVencimentoBoleto)) {
			System.out.println("Boleto não vencido");
		} else {
			System.out.println("Boleto vencido - URGENTE");
		}
	}
}
