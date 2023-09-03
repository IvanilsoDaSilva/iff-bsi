package TP.p2_2.enitities;

import java.io.*;
import java.util.*;

public class DatasetHandler {
	// Fields
	private String divider, header[];
	private File file;
	private MusicList musics = new MusicList();
	private int headerIndex[] = {};

	// Methods - Construct
	public DatasetHandler (File file, String divider, String[] header) {
		this.divider = divider;
		this.file = file;
		this.header = header;
	}
	
	public DatasetHandler (MusicList musics, String divider, String[] header) {
		this.divider = divider;
		this.musics = musics;
		this.header = header;
	}
	
	// Methods - Getter and Setter
	public String getDivider() {
		return divider;
	}
//	public void setDivider(String divider) {
//		this.divider = divider;
//	}
	public File getFile() {
		return file;
	}
//	public void setFile(File file) {
//		this.file = file;
//	}
	public MusicList getMusics() {
		return this.musics;
	}
	public void setMusics(MusicList musics) {
		this.musics = musics;
	}
	public String[] getHeader() {
		return header;
	}
//	public void setHeader(String[] header) {
//		this.header = header;
//	}
	
	// Methods - Others
	public MusicList saveList() throws FileNotFoundException, IOException {
		BufferedReader filerBufferedReader = new BufferedReader(new FileReader(this.file));
		String header[] = filerBufferedReader.readLine().split(this.divider);
		String line = filerBufferedReader.readLine();
		int cont=0;
		this.headerIndex = new int[this.header.length];
		
		// Obtém os indexs do cabeçalho informado
		for(int i=0;i<this.header.length;i++) {
			this.headerIndex[i] = Arrays.asList(header).indexOf(this.header[i]);
		}
		
		// Converte linhas de um arquivo CSV para objetos de uma lista
		System.out.println("Saving...");
		while (line != null) {
			System.out.println(++cont); // Soma antes de imprimir. Se fosse cont++ iria imprimir e depois somar
			Music music = new Music();
			for(int i : this.headerIndex) {
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
			this.musics.add(music);
			line = filerBufferedReader.readLine();
		}
		System.out.println("Successfully saved!");
		filerBufferedReader.close();
		return this.musics;
	}
	
	public MusicVetor saveVetor() {
		return new MusicVetor();
	}
	
	public void exportCSVTo(String path) throws FileNotFoundException, IOException {
		BufferedWriter arquivoBuferizado = new BufferedWriter(new FileWriter(path));
		String line = "";
		int cont = 0;
		
		// Insere a linha de cabeçario
		for(int i=0;i<this.header.length;i++) {
			line+=this.header[i]+this.divider;
		}
		line = line.substring(0, line.length()-1)+"\n"; // Pega o cabecalho reovendo o ultimo divisor
		
		// Converte os objetos musica em uma lista para linhas de um arquivo CSV
		System.out.println("Exporting...");
		for(Music music : this.musics) {
			System.out.println(++cont); // Soma antes de imprimir. Se fosse cont++ iria imprimir e depois somar
			for(String i : this.header) {
				// Melhorar
				switch(i) {
				  case "Artist": // Artist
					  line+=music.getArtist()+this.getDivider();
					  break;
				  case "Track": // Track
					  line+=music.getTrack()+this.getDivider();
				    break;
				  case "Album": // Album
					  line+=music.getAlbum()+this.getDivider();
				    break;
				  case "Album_Type": // Album type
					  line+=music.getAlbumType()+this.getDivider();
				    break;
				  case "Danceability": // Danceability
					  line+=music.getDanceability()+this.getDivider();
				    break;
				  case "Energy": // Energy
					  line+=music.getEnergy()+this.getDivider();
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
					  line+=music.getDurationMin()+this.getDivider();
					  break;
//				  case 14: // Title
//					  break;
//				  case 15: // Channel
//					  break;
				  case "Views": // Views
					  line+=music.getViews()+this.getDivider();
					  break;
				  case "Likes": // Likes
					  line+=music.getLikes()+this.getDivider();
					  break;
				  default:
					  break;
				}
			}
			line = line.substring(0, line.length()-1)+"\n";
		}
		System.out.println("Exporting successfully!");
		
		arquivoBuferizado.write(line);
		arquivoBuferizado.close();
	}
}
