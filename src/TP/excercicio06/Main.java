package TP.excercicio06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File entrada = new File(System.getProperty("user.dir")+"/src/TP/excercicio06/entrada/");
		File saida = new File(System.getProperty("user.dir")+"/src/TP/excercicio06/saida/");
		File exemplo = new File(saida+"/exemplo.odt");
		File arquivoOdt = new File(saida+"/saida.odt");
		File[] listaDeArquivos = entrada.listFiles();
		
		System.out.println(exemplo);
		System.out.println(arquivoOdt);
		
//		Files.copy(exemplo, arquivoOdt, null);
		
//		arquivoOdt.renameTo(new File(saida+"/saida.zip"));
		
		for (File arquivo : listaDeArquivos) {
//			Files.copy(arquivo, arquivoOdt+"/pictures");
		}
//		
//		arquivoOdtEscrita.flush();
//		arquivoOdtEscrita.close();
	}
}
