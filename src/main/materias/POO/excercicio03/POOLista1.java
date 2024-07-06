package POO.excercicio03;

public class POOLista1 {
    public static void main(String[] args) {
        Faturamento faturamento1 = new Faturamento("2023001", "Faturamento1", 2, 5.5);
        faturamento1.setQuantidade(5);
        System.out.println("Descricao: "+faturamento1.getDescricao());
        System.out.println("Total do faturamento: "+faturamento1.getTotalFatura());
        
        System.out.println("");
        
        Empregado empregado1 = new Empregado("Goku", "Son", 1000);
        Empregado empregado2 = new Empregado("Vegeta", "Principe Sayajin", 9000);
        System.out.println("Salário anual de "+empregado1.getNome()+": "+empregado1.getSalario()*12);
        System.out.println("Salário anual de "+empregado2.getNome()+": "+empregado2.getSalario()*12);
        empregado1.setSalario(empregado1.getSalario()*1.1);
        empregado2.setSalario(empregado2.getSalario()*1.1);
        System.out.println("Salário anual de "+empregado1.getNome()+": "+empregado1.getSalario()*12);
        System.out.println("Salário anual de "+empregado2.getNome()+": "+empregado2.getSalario()*12);
        
        System.out.println("");
        
        Data data1 = new Data(12,12,2022);
        System.out.println("Data: "+data1.displayData());
    }
}