package POO.excercicio04.questao01;

public class Administrativo extends Funcionario {
	private String turno;
	private double adicionalNoturno;
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	public Administrativo (){
		super();
	}
	
	public Administrativo(String nome, String cpf, String matricula, String turno, double adicionalNoturno) {
		super(nome, cpf, matricula);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
		
	}
	
	public String exibirDados() {
		if (turno == "noite") {
			return "\nNome: "+this.nome+"\nCpf: "+this.cpf+"\nMatricula: "+this.matricula+"\nTurno: "+this.turno+"\nAdicional: "+adicionalNoturno;	
		} else {
			return "\nNome: "+this.nome+"\nCpf: "+this.cpf+"\nMatricula: "+this.matricula+"\nTurno: "+this.turno;	
		}
	}
}