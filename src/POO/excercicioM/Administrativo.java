package POO.excercicioM;

public class Administrativo extends Assistente{
    // Fields
    private String turno;

    // Method - Getters and Setters
    /**
     * @return the bonus
     */
    public String getTurno() {
        return this.turno;
    }
    
    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    // Method - Construct
    public Administrativo(String nome, String cpf, String rg, String matricula, String turno){
        super(nome, cpf, rg, matricula);
        this.turno = turno;
    }
    
    public Administrativo(){
    }
}
