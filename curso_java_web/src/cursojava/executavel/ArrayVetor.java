package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };

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
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex Fernando Egidio 2");
		aluno2.setNomeEscola("JDEV Treinamento 2");

		// criação da disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java 2");
		disciplina3.setNotas(notas);

		aluno2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Lógica de programação 2");
		disciplina4.setNotas(notasLogica);

		aluno2.getDisciplinas().add(disciplina4);

		Aluno[] arrayAlunos = new Aluno[2];

		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		for (int i = 0; i < arrayAlunos.length; i++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[i].getNome());

			for (Disciplina d : arrayAlunos[i].getDisciplinas()) {
				System.out.println("Nome da disciplina é : " + d.getDisciplina());

				for (int posNota = 0; posNota < d.getNotas().length; posNota++) {
					System.out.println("A nota número : " + posNota + " é igual = " + d.getNotas()[posNota]);
				}
			}
		}

	}
}
