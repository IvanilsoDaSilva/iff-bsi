package TP.p2_2.enitities;

public class Music {
	private String artist, track;
	
	public Music() {
	}
	public Music(String artist,  String track) {
		this.artist = artist;
		this.track = track;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
}
