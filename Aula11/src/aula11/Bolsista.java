package aula11;
public class Bolsista extends Aluno {
    private int bolsa;

    public void renovaBolsa() {
        System.out.println("Bolsa renovada.");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " Pagando mensalidade - bolsa");
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
