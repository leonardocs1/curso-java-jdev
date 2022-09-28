package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Alex Egidio");
		pessoa1.setIdade(50);
		pessoa1.setEmail("pessoa1@email.com");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Leonardo Costa");
		pessoa2.setIdade(30);
		pessoa2.setEmail("pessoa2@email.com");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Maria Jesus");
		pessoa3.setIdade(40);
		pessoa3.setEmail("pessoa3@email.com");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\leoco\\git\\repository\\curso_java_web\\src\\cursojava\\arquivos\\arquivo.txt");
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}
}
