package POO.excercicio02.questao03.Relogio;

public class Data {
	// Atributos de Classe
	private int dia, mes, ano;
	
	// Métodos de Classe - Construtor
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Métodos de Classe - Getters e Setteres
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// Métodos de Classe
	public String mostrarData() {
		return this.dia+"/"+this.mes+"/"+this.ano;
	}
}
