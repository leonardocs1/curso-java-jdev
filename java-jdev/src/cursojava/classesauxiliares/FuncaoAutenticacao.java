package cursojava.classesauxiliares;

import curso.java.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

}
