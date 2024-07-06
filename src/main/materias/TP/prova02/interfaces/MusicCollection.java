package TP.prova02.interfaces;

import TP.prova02.enitities.*;

public interface MusicCollection extends Iterable<Music> {
	public boolean add(Music music);
	public boolean remove(String nome);
	public Music get(int index);
	public int length();
	public boolean swap(int firstIndex, int secondIndex);
	public boolean update(int index, Music music);
	public void sort(Sorter sort);
}
