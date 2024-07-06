package POO.teste02.entities;

public class Gerente extends Funcionario {
	// Fields
	private String area;
	
	// Methods - Getters and Setters
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	// Methods - Construct
	public Gerente(String nome, Data nascimento, double salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}
	
	public Gerente() {
	}
	
	// Methods - Others
	@Override
	public void imprimeDados() {
		// TODO Auto-generated method stub
		System.out.println(
			"\nNome: "+this.nome+"\nNascimento: "+this.nascimento.getDia()+"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno()+
			"\nSalario: "+this.salario+"\nÁrea: "+this.area
		);
	}
	
	@Override
	public double calculaImpostos() {
		return this.salario * 0.05;
	}
}
