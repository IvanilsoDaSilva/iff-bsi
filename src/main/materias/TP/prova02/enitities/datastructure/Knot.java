package TP.prova02.enitities.datastructure;

import TP.prova02.enitities.*;

public class Knot {
	// Fields
	private Music music;
	private Knot knot;
	
	// Methods - Construct
	public Knot() {
	}
	public Knot(Music music, Knot knot) {
		this.music = music;
		this.knot = knot;
	}
	
	// Methods - Setters and Getters
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	public Knot getNext() {
		return knot;
	}
	public void setNext(Knot knot) {
		this.knot = knot;
	}
	
	// Methods - Others
}
