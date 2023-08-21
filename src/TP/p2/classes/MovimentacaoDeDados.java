package TP.p2.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MovimentacaoDeDados {
	// Queria fazer uma chamada recursiva (Onde acabaria quando a linha lida fosse null), porem são muitas chamadas...
	public static ArrayList<Musica> importacao(File arquivo, String divisor) throws IOException{
		BufferedReader arquivoBuferizado = new BufferedReader(new FileReader(arquivo));
		ArrayList<Musica> musicas = new ArrayList<Musica>();
		String linha = "";
		
		int numero = 0; // variavel de teste
		
		arquivoBuferizado.readLine();
		linha = arquivoBuferizado.readLine();
		while (linha != null) {
			System.out.println(numero++); // acrescento de teste
			
			Musica musica = new Musica();
			
			musica.setArtista(linha.split(divisor)[0]); // Artist
			musica.setTrilha(linha.split(divisor)[1]); // Track
			try { musica.setDancabilidade(Double.parseDouble(linha.split(divisor)[4]));}
			catch (Exception e){musica.setDancabilidade(0);}
			try {musica.setEnergia(Double.parseDouble(linha.split(divisor)[5]));}
			catch (Exception e){musica.setEnergia(0);}
			try {musica.setDuracao(Double.parseDouble(linha.split(divisor)[13]));}
			catch (Exception e){musica.setDuracao(0);}
			try {musica.setVisualizacoes(Double.parseDouble(linha.split(divisor)[14]));}
			catch (Exception e){musica.setVisualizacoes(0);}
			try {musica.setCurtidas(Double.parseDouble(linha.split(divisor)[16]));}
			catch (Exception e){musica.setCurtidas(0);}
			
			musicas.add(musica);
			
			linha = arquivoBuferizado.readLine();
		}
		
		return musicas;
	}
	
	public static void exportacao (ArrayList<Musica> dados){
		
	}
}
