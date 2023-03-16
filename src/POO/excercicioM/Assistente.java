package POO.excercicioM;

public class Assistente extends Funcionario{
    // Fields
    protected String matricula;

    // Method - Getters and Setters
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // Method - Construct
    public Assistente(String nome, String cpf, String rg, String matricula){
        super(nome, cpf, rg);
        this.matricula = matricula;
    }
    
    public Assistente(){
    }
    
    // Method - Other
    public void exibirDados(){
        System.out.println(super.nome);
        System.out.println(super.cpf);
        System.out.println(super.rg);
        System.out.println(this.matricula);
    }
}
