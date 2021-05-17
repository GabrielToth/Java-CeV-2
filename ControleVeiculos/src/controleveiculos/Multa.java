package controleveiculos;
public class Multa{
    private Motorista m;
    private Automovel a;
    private Caminhao c;
    private Moto x;
    private int multa;

    public Multa(Motorista m, Automovel a) {
        this.m = m;
        this.a = a;
    }

    public Multa(Motorista m, Caminhao c) {
        this.m = m;
        this.c = c;
    }

    public Multa(Motorista m, Moto x) {
        this.m = m;
        this.x = x;
    }

    public static void multar(Motorista m, Automovel a) {
    }
    
    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    @Override
    public String toString() {
        return "Multa{" + "m=" + m + ", a=" + a + ", c=" + c + ", x=" + x + '}';
    }
    
    
}
