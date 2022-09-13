package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class Teste {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 4; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + (qtd + 1) + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Qual é o Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual é o CPF?"); String nomeMae =
			 * JOptionPane.showInputDialog("Nome da mãe? "); String nomePai =
			 * JOptionPane.showInputDialog("Nome do pai? "); String dataMatricula =
			 * JOptionPane.showInputDialog("Data Matricula? "); String serieEscolar =
			 * JOptionPane.showInputDialog("Qual a série escolar? "); String nomeEscola =
			 * JOptionPane.showInputDialog("Qual o nome da escola? ");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setSerieMatriculado(serieEscolar); aluno1.setNomeEscola(nomeEscola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("-------------- Lista de Aprovados ------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------- Lista de Reprovados ------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------- Lista em Recuperação ------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}

	}

}
