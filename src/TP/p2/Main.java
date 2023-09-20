package TP.p2;

import java.io.*;

import TP.p2.enitities.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String divider = ";";
		String header[] = {"Artist", "Track" ,"Danceability", "Energy", "Duration_min", "Views", "Likes"};
		File inputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/input/input-99.csv");
		File outputFile = new File(System.getProperty("user.dir")+"/src/TP/p2/io/output/output-99.csv");
		MusicList musicList = new MusicList();
		
//		//teste1
//		File arquivo = new File(System.getProperty("user.dir")+"/src/TP/p2/io/input/input3.csv");
//		DatasetHandler dataset = new DatasetHandler(arquivo, divisor, cabecalho);
//		MusicList musics = dataset.saveList();
//		Music music1 = new Music();
//		Music music2 = new Music();
//		Music music3 = new Music();
//		music1.setTrack("Robocop Gay");music1.setArtist("Mamonas Assassinas");music1.setDanceability(1.2);
//		music2.setTrack("Pelados em Santos");music2.setArtist("Mamonas Assassinas");
//		music3.setTrack("DNA");music3.setArtist("BTS");
//		musics.add(music1);
//		musics.add(music2);
//		musics.add(music3);
//		musics.remove("Feel Good Inc.");
//		musics.update(0, new Music());
//		musics.swap(0, 1);
		
		DatasetHandler datasetHandler = new DatasetHandler();
		datasetHandler.fileToObject(inputFile, musicList, divider, header);
		
		Music music1 = new Music();
		Music music2 = new Music();
		Music music3 = new Music();
		Music music4 = new Music();
		Music music5 = new Music();
		music1.setTrack("Robocop Gay");music1.setArtist("Mamonas Assassinas");music1.setDanceability(1.2);
		music2.setTrack("Pelados em Santos");music2.setArtist("Mamonas Assassinas");
		music3.setTrack("DNA");music3.setArtist("BTS");
		music4.setTrack("Cupido");music3.setArtist("Pericles");
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(music3);
		musicList.add(music4);
		
		datasetHandler.objectToFile(outputFile, musicList, divider, header);
	}
}
