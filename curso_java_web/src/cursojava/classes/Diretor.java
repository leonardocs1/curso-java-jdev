package cursojava.classes;

public class Diretor extends Pessoa {

	private String registtroEducacao;
	private int tempoDirecao;
	private String titulacao;

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

}
