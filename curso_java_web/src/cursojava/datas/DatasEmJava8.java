package cursojava.datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Dura��o em Nano Segundos: " + duracao.toNanos());
		
		System.out.println("Dura��o em Minutos: " + duracao.getSeconds());
		
		System.out.println("Dura��o em Horas: " + duracao.toHours());
		
		System.out.println("Dura��o em Milisegundos: " + duracao.toMillis());

	}

}
