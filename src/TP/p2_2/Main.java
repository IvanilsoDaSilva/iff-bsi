package TP.p2_2;

import java.io.*;
import java.util.List;

import TP.p2_2.enitities.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String divisor = ";";
		String cabecalho[] = {"Artist", "Track" ,"Danceability", "Energy", "Duration_min", "Views", "Likes"};
		
		//teste1
		File arquivo = new File(System.getProperty("user.dir")+"/src/TP/p2_2/io/input/input3.csv");
		DatasetHandler dataset = new DatasetHandler(arquivo, divisor, cabecalho);
		MusicList musicas = dataset.saveList();
		
		dataset.exportCSVTo(System.getProperty("user.dir")+"/src/TP/p2_2/io/output/output1.csv");
		
		//teste2
//		Music music1 = new Music();
//		Music music2 = new Music();
//		Music music3 = new Music();
//		MusicList musicList = new MusicList();
//		
//		music1.setTrack("Robocop Gay");music1.setArtist("Mamonas Assassinas");
//		music2.setTrack("Pelados em Santos");music2.setArtist("Mamonas Assassinas");
//		music3.setTrack("DNA");music3.setArtist("BTS");
//		
//		musicList.addMusic(music1);
//		musicList.addMusic(music2);
//		musicList.addMusic(music3);
//		
//		DatasetHandler dataset = new DatasetHandler(musicList, divisor, cabecalho);
//		
//		dataset.exportCSVTo(System.getProperty("user.dir")+"/src/TP/p2_2/io/output/output2.csv");
	}
}
