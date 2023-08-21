package TP.p2.classes;

public class Musica {
	private String artista, trilha;
	private double dancabilidade, energia, duracao, visualizacoes, curtidas;
	
	public Musica(String artista, String trilha, double dancabilidade, double energia, double duracao, double visualizacoes, double curtidas) {
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

	public double getDancabilidade() {
		return dancabilidade;
	}

	public void setDancabilidade(double dancabilidade) {
		this.dancabilidade = dancabilidade;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getVisualizacoes() {
		return visualizacoes;
	}

	public void setVisualizacoes(double visualizacoes) {
		this.visualizacoes = visualizacoes;
	}

	public double getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(double like) {
		this.curtidas = like;
	}
}
