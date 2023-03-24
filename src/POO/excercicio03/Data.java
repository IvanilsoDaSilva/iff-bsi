package POO.excercicio03;

public class Data {
    // Fields
    public int dia, mes, ano;
    
    // Methods - Setters and Getteres
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    // Methods - Construct
    public Data(int dia, int mes, int ano) {
        if (!(dia<=31 && dia>=1) || !(mes<=12 && dia>=1)){
            System.out.println("Erro");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    public Data() {
    }
    
    // Methods - Others
    public String displayData(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
}
