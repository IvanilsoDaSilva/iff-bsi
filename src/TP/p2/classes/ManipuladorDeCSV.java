package TP.p2.classes;

import java.io.*;
import java.util.ArrayList;

public class ManipuladorDeCSV {
	private String divisor, caminhoDeImportacao, caminhoDeExportacao, cabecalho[];
	private File arquivoImportacao, arquivoExportacao;
	
	public ManipuladorDeCSV(String caminhoDeImportacao, String caminhoDeExportacao, String divisor) {
		this.divisor = divisor;
		this.caminhoDeImportacao = caminhoDeImportacao;
		this.caminhoDeExportacao = caminhoDeExportacao;
		this.arquivoImportacao = new File(caminhoDeImportacao);
		this.arquivoExportacao = new File(caminhoDeExportacao);
	}
	
	// Queria fazer uma chamada recursiva (Onde acabaria quando a linha lida fosse null), porem são muitas chamadas...
	public ArrayList<Musica> importacao() throws IOException{
		BufferedReader arquivoBuferizado = new BufferedReader(new FileReader(this.arquivoImportacao));
		ArrayList<Musica> musicas = new ArrayList<Musica>();
		String linha = "";
		
		arquivoBuferizado.readLine();
		linha = arquivoBuferizado.readLine();
		while (linha != null) {
			Musica musica = new Musica();
			
			musica.setArtista(linha.split(this.divisor)[0]);
			musica.setTrilha(linha.split(this.divisor)[1]);
			try { musica.setDancabilidade(Float.parseFloat(linha.split(this.divisor)[4]));}
			catch (Exception e){musica.setDancabilidade(0);}
			try {musica.setEnergia(Float.parseFloat(linha.split(this.divisor)[5]));}
			catch (Exception e){musica.setEnergia(0);}
			try {musica.setDuracao(Float.parseFloat(linha.split(this.divisor)[13]));}
			catch (Exception e){musica.setDuracao(0);}
			try {musica.setVisualizacoes(Float.parseFloat(linha.split(this.divisor)[14]));}
			catch (Exception e){musica.setVisualizacoes(0);}
			try {musica.setCurtidas(Integer.parseInt(linha.split(this.divisor)[16]));}
			catch (Exception e){musica.setCurtidas(0);}
			musicas.add(musica);
			
			linha = arquivoBuferizado.readLine();
		}
		
		return musicas;
	}
	
	public void exportacao (ArrayList<Musica> dados) throws IOException{
		this.arquivoExportacao.createNewFile();
		BufferedWriter arquivoBuferizado = new BufferedWriter(new FileWriter(this.arquivoExportacao));
		
		for(Musica dado : dados) {
			arquivoBuferizado.write(
				dado.getArtista()+";"+dado.getTrilha()+";"+
				dado.getDancabilidade()+";"+dado.getEnergia()+";"+
				dado.getDuracao()+";"+dado.getVisualizacoes()+";"+dado.getCurtidas()+"\n");
		}
		
		arquivoBuferizado.flush();
	}
}
