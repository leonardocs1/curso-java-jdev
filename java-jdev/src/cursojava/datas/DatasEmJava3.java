package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); // pega a data atual
		
		// simular uma data que vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021")); // definindo uma data qualquer
		
		calendar.add(Calendar.DAY_OF_MONTH, -40);
		
		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando o ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
