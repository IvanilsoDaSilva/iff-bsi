package TP.p2_2.enitities;

public class Knot {
	// Fields
	private Music music;
	private Knot knot;
	
	// Methods - Constrcut
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
	public Knot getNextMusic() {
		return knot;
	}
	public void setNextMusic(Knot knot) {
		this.knot = knot;
	}
	
	// Methods - Others
}
