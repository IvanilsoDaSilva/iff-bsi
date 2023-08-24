package TP.p2;

import java.io.*;

import java.util.*;

import TP.p2.classes.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ManipuladorDeCSV manipulador = new ManipuladorDeCSV(
			System.getProperty("user.dir")+"/src/TP/p2/entrada-de-arquivo/dataset2-entrada.csv",
			System.getProperty("user.dir")+"/src/TP/p2/saida-de-arquivo/dataset-saida.csv",
			";", new String[] {"music", }

		);
		
//		ArrayList<Musica> musicas = manipulador.importacao();
		manipulador.exportacao(manipulador.importacao());
	}
}