package TP.p2;

import java.io.*;

import java.util.*;

import TP.p2.classes.*;

public class Main {
	public static void main(String[] args) throws IOException {
		File arquivo = new File(System.getProperty("user.dir")+"/src/TP/p2/entrada-de-arquivo/dataset2.csv");
		
		ManipuladorDeCSV manipulador = new ManipuladorDeCSV(divider, caminhoDeImportacao, caminhoDeExportacao); 
	
		ArrayList<Musica> musicas = manipulador.importacao(arquivo, ";");
		manipulador.exportacao(musicas);
	}
}
