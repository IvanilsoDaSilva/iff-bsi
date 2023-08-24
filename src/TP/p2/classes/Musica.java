package TP.p2.classes;

public class Musica {
	private String artista, trilha;
	private float dancabilidade, energia, duracao, visualizacoes;
	private int curtidas;
	
	public Musica(String artista, String trilha, float dancabilidade, float energia, float duracao, float visualizacoes, int curtidas) {
		this.artista = artista;
		this.trilha = trilha;
		this.dancabilidade = dancabilidade;
		this.energia = energia;
		this.duracao = duracao;
		this.visualizacoes = visualizacoes;
		this.curtidas = curtidas;
	}
	
	public Musica(String artista, String trilha) {
		this.artista = artista;
		this.trilha = trilha;
	}
	
	public Musica() {}

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

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int like) {
		this.curtidas = like;
	}
}
