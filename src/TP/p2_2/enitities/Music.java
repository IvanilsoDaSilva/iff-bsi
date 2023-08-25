package TP.p2_2.enitities;

public class Music {
	private Object artist, track;
	
	public Music() {
	}
	public Music(String artist,  String track) {
		this.artist = artist;
		this.track = track;
	}
	public Object getArtist() {
		return artist;
	}
	public void setArtist(Object artist) {
		this.artist = artist;
	}
	public Object getTrack() {
		return track;
	}
	public void setTrack(Object track) {
		this.track = track;
	}
}
