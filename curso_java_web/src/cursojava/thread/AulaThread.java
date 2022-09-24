package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// ***************DIVISAO DAS THREADS

		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// código da rotina que eu quero executar em paralelo do envio de e-mail
			for (int pos = 0; pos < 10; pos++) {

				// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Dá um tempo */
			}
			// Fim do código em paralelo
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			// código da rotina que eu quero executar em paralelo do envio de nota fiscal
			for (int pos = 0; pos < 10; pos++) {

				// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal.");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Dá um tempo */
			}
			// Fim do código em paralelo

		}
	};
}
