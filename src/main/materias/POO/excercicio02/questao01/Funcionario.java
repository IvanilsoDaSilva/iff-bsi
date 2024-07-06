package POO.excercicio02.questao01;
import java.sql.Date;

public class Funcionario {
	// Atributos de classe
	private String nome, departamento, rg;
	private double salario;
	private Date dataEntrada;
	private boolean ativo;
	
	// Métodos de classe - Construtor
	public Funcionario() {
		super();
	}
	
	// Métodos de classe - Setters e Getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getSalario() {
		return salario;
	}
//	public void setSalario(double salario) {
//		this.salario = salario;
//	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	// Métodos de classe
	public void bonifica(double bonificacao) {
		this.salario =+ bonificacao;
	}
	public void demite() {
		this.ativo = false;
	}
	public void mostrar() {
		System.out.print("Nome: "+this.nome+"\n");
		System.out.print("RG: "+this.rg+"\n");
		System.out.print("Departamento: "+this.departamento+"\n");
		System.out.print("Salário: "+this.salario+"\n");
		System.out.print("Data de entrada: "+this.dataEntrada+"\n");
		System.out.print("Ativo: "+this.ativo+"\n");
	}
}