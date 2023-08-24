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
	public void importFrom(File file, String divider, String[] header) {
		
	}
	
	public void exportTo(File file) {
		
	}
}
