package cursojava.classes;

import curso.java.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String registtroEducacao;
	private int tempoDirecao;
	private String titulacao;

	private String login;
	private String senha;

	public Diretor() {
		// TODO Auto-generated constructor stub
	}

	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getRegisttroEducacao() {
		return registtroEducacao;
	}

	public void setRegisttroEducacao(String registtroEducacao) {
		this.registtroEducacao = registtroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registtroEducacao=" + registtroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 3900.78;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return this.login.equals("leonardo") && this.senha.equals("123");
	}

}
