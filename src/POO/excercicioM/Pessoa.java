package POO.excercicioM;

public abstract class Pessoa {
    // Fields
    protected String nome;
    protected String cpf;
    protected String rg;

    // Method - Getters and Setters
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    // Method - Construct
    public Pessoa(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public Pessoa(){
    }
}
