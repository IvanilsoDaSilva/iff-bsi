package TP.prova02.controllers;

import java.io.*;

import java.util.*;

import TP.prova02.enitities.*;
import TP.prova02.interfaces.*;

public class DatasetHandler {
	// Methods - Construct
	/**
	 * Instancia um novo objeto do tipo @DatasetHandler
	 */
	public DatasetHandler() {}
	
	// Methods - Others
	/**
	 * Transporta os dados de um arquivo CSV para uma lista de objetos
	 * 
	 * @param file
	 * @param collenction
	 * @param divider
	 * @param header
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static MusicCollection fileToObject(File file, MusicCollection collenction, String divider, String[] header) throws FileNotFoundException, IOException {
		BufferedReader filerBufferedReader = new BufferedReader(new FileReader(file));
		String headerFull[] = filerBufferedReader.readLine().split(divider);
		String line = filerBufferedReader.readLine();
		int[] headerIndex = new int[header.length];
		
		
		// Obtém os indexs do cabeçalho informado
		for(int i=0;i<header.length;i++) {
			headerIndex[i] = Arrays.asList(headerFull).indexOf(header[i]);
		}
		
		// Converte linhas de um arquivo CSV para objetos de uma lista
		while (line != null) {
			Music music = new Music();
			for(int i : headerIndex) {
				Object data = line.split(divider)[i];
				if (i<0) {
					break;
				} else {
					try {
						// Melhorar
						switch(i) {
							  case 0: // Artist
								  music.setArtist(data.toString());
								  break;
							  case 1: // Track
								  music.setTrack(data.toString());
								  break;
							  case 2: // Album
								  music.setAlbum(data.toString());
								  break;
							  case 3: // Album type
								  music.setAlbumType(data.toString());
								  break;
							  case 4: // Danceability
								  music.setDanceability(Double.parseDouble(data.toString()));
								  break;
							  case 5: // Energy
								  music.setEnergy(Double.parseDouble(data.toString()));
								  break;
							  case 6: // Loudness
								  break;
							  case 7: // Speechiness
								  break;
							  case 8: // Acousticness
								  break;
							  case 9: // Instrumentalness
								  break;
							  case 10: // Liveness
								  break;
							  case 11: // Valence
								  break;
							  case 12: // Time
								  break;
							  case 13: // Duration in Minutes
								  music.setDurationMin(Double.parseDouble(data.toString()));
								  break;
							  case 14: // Title
								  break;
							  case 15: // Channel
								  break;
							  case 16: // Views
								  music.setViews(Double.parseDouble(data.toString()));
								  break;
							  case 17: // Likes
								  music.setLikes(Double.parseDouble(data.toString()));
								  break;
							  default:
								  break;
						}
					} catch(Exception e) {
						System.out.println(e+", on the line: "+line);
					}
				}
			}
			collenction.add(music);
			line = filerBufferedReader.readLine();
		}
		filerBufferedReader.close();
		return collenction;
	}
	
	/**
	 * Transporta os dados de uma lista de objetos para um arquivo CSV
	 * 
	 * @param file
	 * @param collenction
	 * @param divider
	 * @param header
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static File objectToFile(File file, MusicCollection collection, String divider, String[] header) throws FileNotFoundException, IOException {
		BufferedWriter arquivoBuferizado = new BufferedWriter(new FileWriter(file));
		String line = "";
		
		// Insere a linha de cabeçario
		for(int i=0;i<header.length;i++) {
			line+=header[i]+divider;
		}
		line = line.substring(0, line.length()-1)+"\n"; // Pega o cabecalho reovendo o ultimo divisor
		
		// Converte os objetos musica em uma lista para linhas de um arquivo CSV
		for(Music music : collection) {
			for(String i : header) {
				// Melhorar
				switch(i) {
				  case "Artist": // Artist
					  line+=music.getArtist()+divider;
					  break;
				  case "Track": // Track
					  line+=music.getTrack()+divider;
				    break;
				  case "Album": // Album
					  line+=music.getAlbum()+divider;
				    break;
				  case "Album_Type": // Album type
					  line+=music.getAlbumType()+divider;
				    break;
				  case "Danceability": // Danceability
					  line+=music.getDanceability()+divider;
				    break;
				  case "Energy": // Energy
					  line+=music.getEnergy()+divider;
				    break;
//				  case 6: // Loudness
//					  break;
//				  case 7: // Speechiness
//					  break;
//				  case 8: // Acousticness
//					  break;
//				  case 9: // Instrumentalness
//					  break;
//				  case 10: // Liveness
//					  break;
//				  case 11: // Valence
//					  break;
//				  case 12: // Time
//					  break;
				  case "Duration_min": // Duration in Minutes
					  line+=music.getDurationMin()+divider;
					  break;
//				  case 14: // Title
//					  break;
//				  case 15: // Channel
//					  break;
				  case "Views": // Views
					  line+=music.getViews()+divider;
					  break;
				  case "Likes": // Likes
					  line+=music.getLikes()+divider;
					  break;
				  default:
					  break;
				}
			}
			line = line.substring(0, line.length()-1)+"\n";
		}
		
		arquivoBuferizado.write(line);
		arquivoBuferizado.close();
		
		return file;
	}
	
//	public void sort(MusicCollection collection, Sorter sorter) {
//		sorter.sort(collection);
//	}
}
