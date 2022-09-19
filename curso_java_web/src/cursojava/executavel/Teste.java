package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;

public class Teste {

	public static void main(String[] args) {

		try {
			
			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe o senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * é uma lista que dentro dela temos uma chave que identifica uma sequencia de
				 * valores também
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 0; qtd <= 0; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + (qtd + 1) + "?");
					String idade = JOptionPane.showInputDialog("Qual a idade?");

//					String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
//					String rg = JOptionPane.showInputDialog("Qual é o Registro Geral?");
//					String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
//					String nomeMae = JOptionPane.showInputDialog("Nome da mãe? ");
//					String nomePai = JOptionPane.showInputDialog("Nome do pai? ");
//					String dataMatricula = JOptionPane.showInputDialog("Data Matricula? ");
//					String serieEscolar = JOptionPane.showInputDialog("Qual a série escolar? ");
//					String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

//					aluno1.setDataNascimento(dataNascimento);
//					aluno1.setRegistroGeral(rg);
//					aluno1.setNumeroCpf(cpf);
//					aluno1.setNomeMae(nomeMae);
//					aluno1.setNomePai(nomePai);
//					aluno1.setDataMatricula(dataMatricula);
//					aluno1.setSerieMatriculado(serieEscolar);
//					aluno1.setNomeEscola(nomeEscola);

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

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("-------------- Lista de Aprovados ------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno: " + aluno.getNome());
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				}

				System.out.println("-------------- Lista de Reprovados ------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno: " + aluno.getNome());
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				}

				System.out.println("-------------- Lista em Recuperação ------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno: " + aluno.getNome());
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			/* imprime o erro no console java */
			e.printStackTrace();

			/* Mensagem do erro ou causa */
			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de número: " + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro de NullPointerException " + e.getClass());
		} catch (ExcecaoProcessarNota e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da exceção customizada: " + e.getClass().getName());
		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");
		}
	}

	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File file = new File("C:\\Users\\leoco\\Downloads\\arquivo.txt");
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}

}
