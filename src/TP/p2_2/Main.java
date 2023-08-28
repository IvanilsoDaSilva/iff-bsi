package TP.p2_2;

import java.io.*;
import java.util.List;

import TP.p2_2.enitities.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {		
//		CSVObject csv = new CSVObject(
//			new File(System.getProperty("user.dir")+"/src/TP/p2/entrada-de-arquivo/dataset2-entrada.csv"),
//			";"
//		);
//		csv.exportTo(new File(""));
		
		// ou
		
		File arquivo = new File(System.getProperty("user.dir")+"/src/TP/p2_2/input/input2.csv");
		String divisor = ";";
		String cabecalho[] = {"Artist", "Track" ,"Danceability", "Energy", "Duration_min", "Views", "Likes"};
		
		CSVObject csv = new CSVObject(arquivo, divisor, cabecalho);
		List<Music> musicas = csv.save();
		csv.exportCSVTo(System.getProperty("user.dir")+"/src/TP/p2_2/output/output.csv");
	}
}
