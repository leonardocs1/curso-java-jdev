package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o: " + i);
			notas[i] = Double.valueOf(valor);
		}
		 
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + i + " � = " + notas[i]);
		}
	}
}
