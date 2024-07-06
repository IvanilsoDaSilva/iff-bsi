package TP.prova02.enitities;

public class Music {
	// Fields
	private String artist, track, album, albumType, title, channel, mostPlayedon;
	private double danceability, energy, loudness, speechiness, acousticness, instrumentalness, liveness, valence, time, durationMin, energyLiveness, views, likes, comments, stream;
	private boolean licensed, official;
	
	// Methods - Constructs
	public Music() {
	}
	public Music(String artist, String track, String album, String albumType, String title, String channel,
			String mostPlayedon, double danceability, double energy, double loudness, double speechiness,
			double acousticness, double instrumentalness, double liveness, double valence, double time,
			double durationMin, double energyLiveness, double views, double likes, double comments, double stream, boolean licensed,
			boolean official) {
		super();
		this.artist = artist;
		this.track = track;
		this.album = album;
		this.albumType = albumType;
		this.title = title;
		this.channel = channel;
		this.mostPlayedon = mostPlayedon;
		this.danceability = danceability;
		this.energy = energy;
		this.loudness = loudness;
		this.speechiness = speechiness;
		this.acousticness = acousticness;
		this.instrumentalness = instrumentalness;
		this.liveness = liveness;
		this.valence = valence;
		this.time = time;
		this.durationMin = durationMin;
		this.energyLiveness = energyLiveness;
		this.views = views;
		this.likes = likes;
		this.comments = comments;
		this.stream = stream;
		this.licensed = licensed;
		this.official = official;
	}
	
	// Methods - Getter and Setter
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
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbumType() {
		return albumType;
	}
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getMostPlayedon() {
		return mostPlayedon;
	}
	public void setMostPlayedon(String mostPlayedon) {
		this.mostPlayedon = mostPlayedon;
	}
	public double getDanceability() {
		return danceability;
	}
	public void setDanceability(double danceability) {
		this.danceability = danceability;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public double getLoudness() {
		return loudness;
	}
	public void setLoudness(double loudness) {
		this.loudness = loudness;
	}
	public double getSpeechiness() {
		return speechiness;
	}
	public void setSpeechiness(double speechiness) {
		this.speechiness = speechiness;
	}
	public double getAcousticness() {
		return acousticness;
	}
	public void setAcousticness(double acousticness) {
		this.acousticness = acousticness;
	}
	public double getInstrumentalness() {
		return instrumentalness;
	}
	public void setInstrumentalness(double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}
	public double getLiveness() {
		return liveness;
	}
	public void setLiveness(double liveness) {
		this.liveness = liveness;
	}
	public double getValence() {
		return valence;
	}
	public void setValence(double valence) {
		this.valence = valence;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getDurationMin() {
		return durationMin;
	}
	public void setDurationMin(double durationMin) {
		this.durationMin = durationMin;
	}
	public double getEnergyLiveness() {
		return this.energyLiveness;
	}
	public void setEnergyLiveness(double energyLiveness) {
		this.energyLiveness = energyLiveness;
	}
	public double getViews() {
		return views;
	}
	public void setViews(double views) {
		this.views = views;
	}
	public double getLikes() {
		return likes;
	}
	public void setLikes(double likes) {
		this.likes = likes;
	}
	public double getComments() {
		return comments;
	}
	public void setComments(double comments) {
		this.comments = comments;
	}
	public double getStream() {
		return stream;
	}
	public void setStream(double stream) {
		this.stream = stream;
	}
	public boolean isLicensed() {
		return licensed;
	}
	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}
	public boolean isOfficial() {
		return official;
	}
	public void setOfficial(boolean official) {
		this.official = official;
	}
	
	// Methods - Others
}
