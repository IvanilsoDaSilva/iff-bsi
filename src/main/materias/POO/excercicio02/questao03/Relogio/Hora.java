package POO.excercicio02.questao03.Relogio;

public class Hora {
	// Atributos de Classe
	private int hora, minuto, segundo;

	// Métodos de Classe - Construtor
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	// Métodos de Classe - Getters e Setteres
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	// Métodos de Classe
	public void mostrarData() {
		System.out.print(this.hora+":"+this.minuto+":"+this.segundo);
	}
}
