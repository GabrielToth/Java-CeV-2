package controleveiculos;
public class Veiculo {
    private String t;

    public Veiculo (String t) {
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t;
    }
    
    
}
