package POO.teste02.entities;

public class Cliente extends Pessoa {
	// Fields
	private String codigo;
	
	// Method - Getters and Setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	// Methods - Construct
	public Cliente(String nome, Data nascimento, String codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}
	
	public Cliente() {
	}
	
	// Methods - Others
	@Override
	public void imprimeDados() {
		// TODO Auto-generated method stub
		System.out.println(
			"\nNome: "+this.nome+"\nNascimento: "+this.nascimento.getDia()+
			"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno()+"\nCodigo: "+this.codigo
		); 
	}
}
