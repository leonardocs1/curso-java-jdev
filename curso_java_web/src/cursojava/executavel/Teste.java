package cursojava.executavel;

import cursojava.classes.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("4444.444.444");
		aluno1.setNumeroCpf("223.455.455-34");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antônio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		
		System.out.println("Nome do aluno 1 é = " + aluno1.getNome());
		System.out.println("Idade do aluno 1 é = " + aluno1.getIdade());
		System.out.println("Data de Nascimento do aluno 1 é = " + aluno1.getDataNascimento());
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Nome do aluno 2 é = " + aluno2.getNome());
		System.out.println("Idade do aluno 2 é = " + aluno2.getIdade());
		System.out.println("Data de Nascimento do aluno 2 é = " + aluno2.getDataNascimento());

		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

	}

}
