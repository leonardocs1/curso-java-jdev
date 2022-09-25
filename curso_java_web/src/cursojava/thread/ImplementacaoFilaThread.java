package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();

		synchronized (iteracao) { //bloquear o acesso a esta lista por outros processos
			while (iteracao.hasNext()) { // enquanto conter dados na fila

				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // pega o objeto atuals

				// Processar 10 mil notas fiscais
				// Gerar uma lista enorme de PDF
				// Gerar um envio em massa de email
				System.out.println("---------------------------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());

				try {
					Thread.sleep(100); // Dar um tempo de descarga de memoria
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		try {
			Thread.sleep(1000); // Após processar toda a lista, dar um tempo para limpeza de memoria
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
