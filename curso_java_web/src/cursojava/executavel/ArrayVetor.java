package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};
		
		// Criação de alunos
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
		// criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNotas(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNotas(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("-----------Disciplina do aluno--------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + d.getDisciplina());
			
			for (int i = 0; i < d.getNotas().length; i++) {
				System.out.println("Nota " + i + " é igual = " + d.getNotas()[i]);
			}
		}
		
	}
}
