package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {

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

		File file = new File(
				"C:\\projetos\\dev\\curso-java-jdev\\java-jdev\\src\\cursojava\\arquivos\\arquivo_excel.xls");

		if (!file.exists()) {
			file.createNewFile();
		}

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // vai ser usado para escrever na planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento"); // criar planilha

		int numeroLinha = 0;

		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++); // Criando uma linha na planilha

			int celula = 0;

			Cell celNome = linha.createCell(celula++); // celula 1
			celNome.setCellValue(p.getNome());

			Cell celEmail = linha.createCell(celula++); // celula 2
			celEmail.setCellValue(p.getEmail());

			Cell celIdade = linha.createCell(celula++); // celula 3
			celIdade.setCellValue(p.getIdade());
		}

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();

		System.out.println("Planilha foi criada!");
	}
}
