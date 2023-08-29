package TP.p2_2;

import java.io.*;
import java.util.List;

import TP.p2_2.enitities.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {		
//		File arquivo = new File(System.getProperty("user.dir")+"/src/TP/p2_2/io/input/input.csv");
//		String divisor = ";";
//		String cabecalho[] = {"Artist", "Track" ,"Danceability", "Energy", "Duration_min", "Views", "Likes"};
//		
//		DatasetHandler dataset = new DatasetHandler(arquivo, divisor, cabecalho);
//		List<Music> musicas = dataset.save();
//		dataset.exportCSVTo(System.getProperty("user.dir")+"/src/TP/p2_2/io/output/output.csv");
		
		Music music1 = new Music();
		Music music2 = new Music();
		music1.setTrack("Robocop Gay");
		music2.setTrack("Pelados em Santos");
		
		MusicList musicList = new MusicList();
		musicList.addMusic(music1);
		musicList.addMusic(music2);
		
		
		
		System.out.println(musicList.toString());
	}
}
