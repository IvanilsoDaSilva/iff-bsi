package TP.p2.classes;

public class Musica {
	// Atributos
	private String artista, trilha, album, albumType, title, canais, maiorTocadora;
	private float dancabilidade, energia, sonoridade, falas, acusticidade, instrumentalismo,
		vivacidade, tempo, duracao, visualizacoes, curtidas, comentarios, stream, energiaVivacidade;
	private boolean licenciado, oficial;
	
	// Metodos construtores
	public Musica(String artista, String trilha, float dancabilidade, float energia, float duracao, float visualizacoes, float curtidas) {
		this.artista = artista;
		this.trilha = trilha;
		this.dancabilidade = dancabilidade;
		this.energia = energia;
		this.duracao = duracao;
		this.visualizacoes = visualizacoes;
		this.curtidas = curtidas;
	}
	public Musica() {}
	
	// Metodos GET e SET
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTrilha() {
		return trilha;
	}
	public void setTrilha(String trilha) {
		this.trilha = trilha;
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
	public String getCanais() {
		return canais;
	}
	public void setCanais(String canais) {
		this.canais = canais;
	}
	public String getMaiorTocadora() {
		return maiorTocadora;
	}
	public void setMaiorTocadora(String maiorTocadora) {
		this.maiorTocadora = maiorTocadora;
	}
	public float getDancabilidade() {
		return dancabilidade;
	}
	public void setDancabilidade(float dancabilidade) {
		this.dancabilidade = dancabilidade;
	}
	public float getEnergia() {
		return energia;
	}
	public void setEnergia(float energia) {
		this.energia = energia;
	}
	public float getSonoridade() {
		return sonoridade;
	}
	public void setSonoridade(float sonoridade) {
		this.sonoridade = sonoridade;
	}
	public float getFalas() {
		return falas;
	}
	public void setFalas(float falas) {
		this.falas = falas;
	}
	public float getAcusticidade() {
		return acusticidade;
	}
	public void setAcusticidade(float acusticidade) {
		this.acusticidade = acusticidade;
	}
	public float getInstrumentalismo() {
		return instrumentalismo;
	}
	public void setInstrumentalismo(float instrumentalismo) {
		this.instrumentalismo = instrumentalismo;
	}
	public float getVivacidade() {
		return vivacidade;
	}
	public void setVivacidade(float vivacidade) {
		this.vivacidade = vivacidade;
	}
	public float getTempo() {
		return tempo;
	}
	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	public float getVisualizacoes() {
		return visualizacoes;
	}
	public void setVisualizacoes(float visualizacoes) {
		this.visualizacoes = visualizacoes;
	}
	public float getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(float curtidas) {
		this.curtidas = curtidas;
	}
	public float getComentarios() {
		return comentarios;
	}
	public void setComentarios(float comentarios) {
		this.comentarios = comentarios;
	}
	public float getStream() {
		return stream;
	}
	public void setStream(float stream) {
		this.stream = stream;
	}
	public float getEnergiaVivacidade() {
		return energiaVivacidade;
	}
	public void setEnergiaVivacidade(float energiaVivacidade) {
		this.energiaVivacidade = energiaVivacidade;
	}
	public boolean isLicenciado() {
		return licenciado;
	}
	public void setLicenciado(boolean licenciado) {
		this.licenciado = licenciado;
	}
	public boolean isOficial() {
		return oficial;
	}
	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}
}
