package controleveiculos;
public class Automovel{
    private String modelo;
    private int multa;

    public Automovel(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Automovel{" + "modelo=" + modelo + ", multa=" + multa + '}';
    }
    
    
}
