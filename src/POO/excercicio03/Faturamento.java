package POO.excercicio03;

public class Faturamento {
    // Fields
    private String numero, descricao;
    private int quantidade;
    private double valor;

    // Methods - Setters and Getteres
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

    public double getValor() {
        return valor;
    }
    
    // Methods - Construct
    public Faturamento(String numero, String descricao, int quantidade, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
     public Faturamento() {
    }
    
    // Methods - Others
    public double getTotalFatura() {
        return this.quantidade * this.valor;
    }
}
