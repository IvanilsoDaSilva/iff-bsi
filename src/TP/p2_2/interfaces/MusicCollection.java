package TP.p2_2.interfaces;

import TP.p2_2.enitities.Music;

public interface MusicCollection {
	public boolean addMusic(Music music);
	public boolean removeMusic(String nome);
	public Music getMusic(int index);
	public int length();
	public boolean swap(int firstIndex, int secondIndex);
	public boolean update(int index, Music music);
}
