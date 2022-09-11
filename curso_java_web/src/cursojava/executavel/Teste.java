package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Qual é o Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe? ");
		String nomePai = JOptionPane.showInputDialog("Nome do pai? ");
		String dataMatricula = JOptionPane.showInputDialog("Data Matricula? ");
		String serieEscolar = JOptionPane.showInputDialog("Qual a série escolar? ");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");
		String nota1 = JOptionPane.showInputDialog("Nota1: ");
		String nota2 = JOptionPane.showInputDialog("Nota2: ");
		String nota3 = JOptionPane.showInputDialog("Nota3: ");
		String nota4 = JOptionPane.showInputDialog("Nota4: ");

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieEscolar);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println("Nome do aluno 1 é = " + aluno1.getNome());
		System.out.println("Idade do aluno 1 é = " + aluno1.getIdade());
		System.out.println("Data de Nascimento do aluno 1 é = " + aluno1.getDataNascimento());
		System.out.println("Média das notas do aluno 1 é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());

	}

}
