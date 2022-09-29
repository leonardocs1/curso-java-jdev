package cursojava.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("733.263.640-91");
		usuario1.setLogin("1111");
		usuario1.setSenha("123456");
		usuario1.setNome("Leonardo Costa");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("380.627.290-52");
		usuario2.setLogin("2222");
		usuario2.setSenha("123456");
		usuario2.setNome("João da Silva");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser =gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\projetos\\dev\\curso-java-jdev\\java-jdev\\src\\cursojava\\arquivos\\filejson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		
		
		
	}

}
