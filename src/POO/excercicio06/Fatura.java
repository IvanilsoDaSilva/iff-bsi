package POO.excercicio06;

public class Fatura implements Pagamento {
	// FIelds
	private final double desconto=1.3;
	private String numero;
	private String descricao;
	private int quantidade;
	private Double precoItem;
	
	// Methods - Construct
	public Fatura() {
	}
	
	public Fatura(String numero, String descricao, int quantidade, Double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoItem = precoItem;
	}
	
	// Methods - Getters and Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoItem() {
		return precoItem * desconto;
	}

	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}
	
	// Methods - Others
	@Override
	public Double getTotalPagamento() {
		return this.getPrecoItem()*this.getQuantidade();
	}
}