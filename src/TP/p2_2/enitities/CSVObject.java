package TP.p2_2.enitities;

import java.io.*;
import java.util.*;

public class CSVObject {
	// Fields
	private String divider = ";", header[] = null;
	private File file = null;
	private List<Music> musics = null;

	// Methods - Constructs
	public CSVObject() {
	}
	public CSVObject (File file, String divider, String[] header) {
		this.divider = divider;
		this.file = file;
	}
	
	// Methods - Getter and Setter
	public String getDivider() {
		return divider;
	}
	public void setDivider(String divider) {
		this.divider = divider;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public List<Music> getMusics() {
		return musics;
	}
	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}
	
	// Methods - Others
	public void importCSVFrom(String divider, String[] columns) throws FileNotFoundException, IOException {
		BufferedReader filerBufferedReader = new BufferedReader(new FileReader(this.file));
		String header[] = filerBufferedReader.readLine().split(divider);
		String linha = filerBufferedReader.readLine();
		int[] columnsIndexs = new int[columns.length];
		String JSONtext = ""; int cont=0;//teste
		
		for(int i=0;i<columns.length;i++) {
			columnsIndexs[i] = Arrays.asList(header).indexOf(columns[i]);
		}
		JSONtext=JSONtext+"[";
		while (linha != null) {
			JSONtext=JSONtext+"{";
//			Music music = new Music();
			for(int i : columnsIndexs) {
				if (i<0) {
//					System.out.println("|");
//					System.out.print("\""+header[i]+":\"\"");
				} else {
//					System.out.print(linha.split(divider)[i]+"|");
					JSONtext=JSONtext+"\""+header[i]+"\":\""+linha.split(divider)[i]+"\",";
				}
			}
			JSONtext=JSONtext+"},\n";
			System.out.println(cont++);
			linha = filerBufferedReader.readLine();
		}
		JSONtext=JSONtext+"]";
		
//		while (linha != null) {
//			Music music = new Music();
//			
//			// Tratamento da linha
//			
//			
//			this.musics.add(music);
//		}
		
		System.out.println("teste");
		System.out.println(JSONtext);
		filerBufferedReader.close();
	}
	
	public void exportCSVTo(String path) {
		
	}
}
