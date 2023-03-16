package POO.excercicioM;

public class Tecnico extends Assistente{
    // Fields
    private Double bonus;

    // Method - Getters and Setters
    /**
     * @return the bonus
     */
    public Double getBonus() {
        return this.bonus;
    }
    
    // Method - Construct
    public Tecnico(String nome, String cpf, String rg,String matricula, double bonus){
        super(nome, cpf, rg, matricula);
        this.bonus = bonus;
    }
    
    public Tecnico(){
    }
}
