package controleveiculos;
public class Caminhao extends Automovel{
    private int multa;
    
    public Caminhao(String modelo) {
        super(modelo);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Caminhao{" + "modelo=" + this.getModelo() + ", multa=" + multa + '}';
    }
    
}
