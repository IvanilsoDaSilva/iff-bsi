package TP.p2_2.enitities;

import TP.p2_2.interfaces.MusicCollection;

public class MusicList implements MusicCollection {
	// Fields
	private int length = 0;
	private Knot firstKnot = new Knot();
	
	// Methods - Constrcut
	public MusicList() {
	}
	
	// Methods - Setters and Getters
	
	// Methods - Others
	@Override
	public boolean addMusic(Music music) {
		if (length == 0) {
			this.firstKnot.setMusic(music);
			this.length=+1;
			return true;
		} else {
			this.firstKnot.setNextMusic(new Knot(music, null));
		}
		return false;
	}

	@Override
	public boolean removeMusic(String nome) {
		return false;
	}

	@Override
	public Music getMusic(int index) {
		return null;
	}

	@Override
	public int length() {
		return this.length;
	}

	@Override
	public boolean swap(int firstIndex, int secondIndex) {
		return false;
	}

	@Override
	public boolean update(int index, Music music) {
		return false;
	}
	
	@Override
	public String toString() {
		String string = "{";
		Knot knot = this.firstKnot;
		
		while(knot != null) {
			string = string + knot.getMusic().getTrack()+",";
			
			knot = knot.getNextMusic();
		}
		
		string = string + "}";
		return string;
	}
}
