package cursojava.executavel;

import cursojava.classes.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Jo�o";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 � = " + aluno1.nome);
		System.out.println("Idade � = " + aluno1.idade);
		
		Aluno aluno2 = new Aluno();

		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);

	}

}
