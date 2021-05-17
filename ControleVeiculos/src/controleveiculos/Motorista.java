package controleveiculos;
public class Motorista{
    private String nome;
    private int multa;

    public Motorista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Motorista{" + "nome=" + nome + ", multa=" + multa + '}';
    }
    
}
