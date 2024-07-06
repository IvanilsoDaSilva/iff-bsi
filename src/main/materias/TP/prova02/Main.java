package TP.prova02;

import java.io.*;

import TP.prova02.controllers.*;
import TP.prova02.enitities.*;
import TP.prova02.enitities.sorters.*;
import TP.prova02.enitities.datastructure.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String divider = ";";
		String header[] = {"Artist", "Track" ,"Danceability", "Energy", "Duration_min", "Views", "Likes"};
		
		/*
		 * Seleção do tamanho do arquivo da Dataset
		 * 
		 * Respectivamente:
		 * 99 linhas
		 * 5079 linhas
		 * 20594 linhas (Arquivo completo)
		 */
		File inputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/input/input-99.csv"); File outputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/output/output-99.csv");
//		File inputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/input/input-5079.csv"); File outputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/output/output-5079.csv");
//		File inputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/input/input-20594.csv"); File outputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/output/output-20594.csv");
		
		/*
		 * Seleção do tipo da lista
		 * 
		 * Respectivamente:
		 * Lista encadeada
		 * Lista vetorizada
		 */
		MusicList list = new MusicList(); // Lista encadeada
//		MusicVetor list = new MusicVetor(200); // Lista vetorizada
		
		System.out.print("Importando para lista...");
		DatasetHandler.fileToObject(inputFile, list, divider, header);
		System.out.println("Importado com sucesso!");
		
		Music music1 = new Music();
		Music music2 = new Music();
		Music music3 = new Music();
		Music music4 = new Music();
		Music music5 = new Music();
		music1.setTrack("Robocop Gay");music1.setArtist("Mamonas Assassinas");music1.setDanceability(1.2);
		music2.setTrack("Pelados em Santos");music2.setArtist("Mamonas Assassinas");
		music3.setTrack("DNA");music3.setArtist("BTS");
		music4.setTrack("Cupido");music4.setArtist("Pericles");
		music5.setTrack("Thriller");music5.setArtist("Michael Jackson");
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);
		
		System.out.print("Ordenando lista...");
//		list.sort(new SelectionSort());
		list.sort(new BubbleSort());
		System.out.println("Ordenado com sucesso!");

		System.out.print("Exportando para CSV...");
		DatasetHandler.objectToFile(outputFile, list, divider, header);
		System.out.println("Exportado para CSV com sucesso!");
	}
}
