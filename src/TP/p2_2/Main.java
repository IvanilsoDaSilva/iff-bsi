package TP.p2_2;

import java.io.*;

import TP.p2_2.enitities.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String divisor = ";";
		String cabecalho[] = {"Artist", "Track" ,"Danceability", "Energy", "Duration_min", "Views", "Likes"};
		
		//teste1
		File arquivo = new File(System.getProperty("user.dir")+"/src/TP/p2_2/io/input/input3.csv");
		DatasetHandler dataset = new DatasetHandler(arquivo, divisor, cabecalho);
		MusicList musics = dataset.saveList();
		Music music1 = new Music();
		Music music2 = new Music();
		music1.setTrack("Robocop Gay");music1.setArtist("Mamonas Assassinas");
		music2.setTrack("Pelados em Santos");music2.setArtist("Mamonas Assassinas");
		musics.add(music1);
		musics.add(music2);
		musics.remove("Feel Good Inc.");
		musics.update(0, new Music());
		musics.swap(0, 1);
		dataset.setMusics(musics);
		
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
//		musicList.add(music1);
//		musicList.add(music2);
//		musicList.add(music3);
//		
//		DatasetHandler dataset = new DatasetHandler(musicList, divisor, cabecalho);
//		
//		dataset.exportCSVTo(System.getProperty("user.dir")+"/src/TP/p2_2/io/output/output2.csv");
	}
}
